public class PdfDocumentFactory extends DocumentFactory { //Concrete factory for Factory Pattern
    @Override
    public Document createDocument(String name) {
      //  return new Document(name, Document.Format.PDF);
        return new PdfDocument(name);
    }
}
