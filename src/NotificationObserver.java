public class NotificationObserver implements DocumentObserver { //Concrete Observer class for Observer Pattern
    String name;
    public String getName() { return name; }
    @Override
    public void update(Document document) {
        System.out.println("Sending notification to document owner: " + document.getName());
    }

}
