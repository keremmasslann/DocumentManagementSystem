public class Main { //Client class of Composite pattern, +++
    public static void main(String[] args) {
        WorkOrder workOrder = new WorkOrder("WO-001");

        DocumentFactory pdfFactory = new PdfDocumentFactory();
        DocumentFactory wordFactory = new WordDocumentFactory();
        // Create a document
        Document document1 = pdfFactory.createDocument("Document 1");
        Document document2 = wordFactory.createDocument("Document 2");

        // Add documents to the work order
        workOrder.Add(document1);
        workOrder.Add(document2);

        // Create sub-work orders
        WorkOrder subWorkOrder1 = new WorkOrder("WO-001-A");
        WorkOrder subWorkOrder2 = new WorkOrder("WO-001-B");

        // Add sub-work orders to the main work order
        workOrder.Add(subWorkOrder1);
        workOrder.Add(subWorkOrder2);

        // Create sub-work order documents
        Document subWorkOrderDocument1 = wordFactory.createDocument("Sub-WorkOrder Document 1");
        Document subWorkOrderDocument2 = pdfFactory.createDocument("Sub-WorkOrder Document 2");

        // Add documents to sub-work orders
        subWorkOrder1.Add(subWorkOrderDocument1);
        subWorkOrder2.Add(subWorkOrderDocument2);

        // Sign the main work order and its documents
        workOrder.sign();
        System.out.println("Main Work Order signed: " + workOrder.isSigned());
        System.out.println("Document 1 signed: " + document1.isSigned());
        System.out.println("Document 2 signed: " + document2.isSigned());
        System.out.println("Sub-WorkOrder Document 1 signed: " + subWorkOrderDocument1.isSigned());
        System.out.println("Sub-WorkOrder Document 2 signed: " + subWorkOrderDocument2.isSigned());
    }
}






