public class VerifyFieldsCommand implements WorkflowCommand{ //Concrete Command for Command Pattern
    private Document document;

    public VerifyFieldsCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        System.out.println("Verifying fields for document: " + document.name);
    }

}
