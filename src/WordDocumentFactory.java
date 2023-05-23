public class WordDocumentFactory extends DocumentFactory{ //Concrete factory for Factory Pattern
    @Override
    public Document createDocument(String name) {
      //  return new Document(name, Document.Format.WORD);
       return new WordDocument(name);
    }
}
