public abstract class DocumentFactory { //Abstract Factory component of Abstract Factory Pattern, Singleton class
    private static DocumentFactory instance;
    String format;

    protected DocumentFactory(String format) {
        this.format=format;
    }

    public synchronized static DocumentFactory getInstance(String format) {
        if (instance == null) {
            instance = createInstance(format);
        }
        return instance;
    }
    private static DocumentFactory createInstance(String format) {
        if(format.equals("Word")) {
            return new WordDocumentFactory(format);
        }
        else if(format.equals("Pdf")){
            return new PdfDocumentFactory(format);
        }
        else{
            return null;
        }
    }
    abstract public Document createDocument(String name);
}
