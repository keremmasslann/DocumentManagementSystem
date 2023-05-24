import java.util.ArrayList;
import java.util.List;

abstract class DocumentSubject { //Subject Class of Observer Pattern

     ArrayList<NotificationObserver> observers = new ArrayList<NotificationObserver>();

    //Register the Observers
    public void Attach (NotificationObserver observer) {
        observers.add(observer);
    }
    //Unregister from the list of Observers.
    public void Detach (NotificationObserver observer) {
        for (int i = 0; i< observers.size(); i++) {
            if (observers.get(i).getName() == observer.getName()) {
                observers.remove(i);
                return;
            }
        }
    }
    //Notify the Observers.
    public void Notify() {
        // set argument to something that helps
        // tell the Observers what happened
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update((Document) this); //burası hatalı muhtemelen
            System.out.println("This document is signed(notification)");
        }
    }

}

