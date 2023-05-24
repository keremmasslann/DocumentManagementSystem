public class Main { //Client class of Composite pattern, +++
    public static void main(String[] args) {
        // Create a work order
        WorkOrder purchaseWorkOrder = new WorkOrder("Purchase Work Order");

        // Create sub-work orders
        WorkOrder shipment = new WorkOrder("Shipment");
        WorkOrder payment = new WorkOrder("Payment");

        // Create document factories
        DocumentFactory wordDocumentFactory = new WordDocumentFactory();
        DocumentFactory pdfDocumentFactory = new PdfDocumentFactory();

        // Create documents using factories
        Document billOfLading = pdfDocumentFactory.createDocument("Bill of Lading");
        Document packagingSlip = pdfDocumentFactory.createDocument("Packaging Slip");
        Document invoice = wordDocumentFactory.createDocument("Invoice");


        shipment.Add(billOfLading);
        shipment.Add(packagingSlip);
        payment.Add(invoice);

        purchaseWorkOrder.Add(shipment);
        purchaseWorkOrder.Add(payment);

        // Process the work order workflow
        purchaseWorkOrder.sign();

        // Check document status
        System.out.println("Document '" + billOfLading.name + "' signed: " + billOfLading.isSigned());
        System.out.println("Document '" + packagingSlip.name + "' signed: " + packagingSlip.isSigned());
        System.out.println("Document '" + invoice.name + "' signed: " + invoice.isSigned());

        // Check work order status
        System.out.println("Work Order '" + purchaseWorkOrder.getName() + "' workflow complete: " + purchaseWorkOrder.isSigned());




    }

}