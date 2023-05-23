public interface DocumentComponent { //Component class of Composite Pattern, +++

    void Add(DocumentComponent d);
    void Remove(DocumentComponent d);
    void Display(int indent);
    public String getName();

    public abstract void sign();

    public abstract boolean isSigned(); //???
}
