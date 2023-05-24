//KEREM ASLAN
//SERKAN KOÇ
//OZAN TANDOĞAN
//ARDA GÖKÇE
//Document Management System
public class Document  extends DocumentSubject implements DocumentComponent{
    //Leaf/Child class of Composite Pattern, Abstract Product of Abstract Factory Pattern
    // Concrete Subject class for Observer Pattern
    String name;
    String format;
    private boolean isSigned;

  public Document(String name,String format) {
      this.name = name;
      this.format = format;
  }
      @Override
    public void Add(DocumentComponent d) {
        System.out.println("cant add to primitive element");
    }

    @Override
    public void Remove(DocumentComponent d) {
        System.out.println("cant remove from primitive element");
    }

    @Override
    public void Display(int indent) {
        for(int i = 1;i <= indent;i++) 	System.out.print("-");
        System.out.println(" "  + name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void sign() {
        this.isSigned = true;
        System.out.println("Document signed");
        super.Notify();
    }

    @Override
    public boolean isSigned() {
        return this.isSigned;
    }
}
