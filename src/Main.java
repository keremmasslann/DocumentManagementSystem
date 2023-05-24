public class Main {
    public static void main(String[] args) {

        WorkOrder workOrder = new WorkOrder("WorkOrder1");

        DocumentFactory wordFactory = DocumentFactory.getInstance("Word");

        DocumentFactory pdfFactory = DocumentFactory.getInstance("Pdf");

        Document doc1 = wordFactory.createDocument("Document1");
        Document doc2 = wordFactory.createDocument("Document2");

        Document subWorkOrderDocument1 = pdfFactory.createDocument("Sub WorkOrder Document 1");
        Document subWorkOrderDocument2 = pdfFactory.createDocument("Sub WorkOrder Document 2");

        workOrder.Add(doc1);
        workOrder.Add(doc2);

        WorkOrder subWorkOrder1 = new WorkOrder("WorkOrder1A");
        WorkOrder subWorkOrder2 = new WorkOrder("WorkOrder1B");

        workOrder.Add(subWorkOrder1);
        workOrder.Add(subWorkOrder2);

        subWorkOrder1.Add(subWorkOrderDocument1);
        subWorkOrder2.Add(subWorkOrderDocument2);

        workOrder.sign();

        DocumentObserver ownerObserver = new NotificationObserver();

        workOrder.Attach((NotificationObserver) ownerObserver);

        workOrder.Display(0);

        workOrder.Detach((NotificationObserver) ownerObserver);

        workOrder.sign();

        workOrder.Display(0);

        WorkflowEngine workflowEngine = new WorkflowEngine();

        WorkflowCommand verifyFieldsCommand = new VerifyFieldsCommand(doc1);
        WorkflowCommand sendForSigningCommand = new SendForSigningCommand(doc2);

        workflowEngine.AddCommand(verifyFieldsCommand);
        workflowEngine.AddCommand(sendForSigningCommand);

        workflowEngine.ProcessWorkflow();
    }

}






