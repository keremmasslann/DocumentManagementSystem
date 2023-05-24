public class PdfDocumentFactory extends DocumentFactory {
    public PdfDocumentFactory(String format) {
        super(format);
    } //Concrete factory for Factory Pattern
    @Override
    public Document createDocument(String name) {
        return new PdfDocument(name);
    }
}
