public class WordDocumentFactory extends DocumentFactory{ //Concrete Factory for Abstract Factory Pattern
    @Override
    public Document createDocument(String name) {
      //  return new Document(name, Document.Format.WORD);
       return new WordDocument(name);
    }
}
