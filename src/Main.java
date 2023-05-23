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




        /*WorkOrder purchaseWorkOrder = new WorkOrder("Purchase Work Order");

        // Create sub-work orders
        WorkOrder shipment = new WorkOrder("Shipment");
        WorkOrder payment = new WorkOrder("Payment");

        // Create documents and add to sub-work orders
        Document billOfLading = new Document("Bill of Lading", "PDF");
        Document packagingSlip = new Document("Packaging Slip", "PDF");
        Document invoice = new Document("Invoice", "MS Word");

        shipment.Add(billOfLading);
        shipment.Add(packagingSlip);
        payment.Add(invoice);

        purchaseWorkOrder.Add(shipment);
        purchaseWorkOrder.Add(payment); */


    }

}