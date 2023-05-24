public class WordDocumentFactory extends DocumentFactory{ //Concrete Factory for Abstract Factory Pattern
    public WordDocumentFactory(String format) {
        super(format);
    }
    @Override
    public Document createDocument(String name) {
       return new WordDocument(name);
    }
}
