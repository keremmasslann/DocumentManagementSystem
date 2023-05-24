public class SendForSigningCommand implements WorkflowCommand{ //Concrete Command for Command Pattern
    private Document document;

    public SendForSigningCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        System.out.println("Sending document " + document.name + "for signing");
    }
}
