import java.util.ArrayList;
import java.util.List;

abstract class DocumentSubject { //Subject Class of Observer Pattern

     ArrayList<NotificationObserver> observers = new ArrayList<NotificationObserver>();


    public void Attach (NotificationObserver observer) {
        observers.add(observer);
    }

    public void Detach (NotificationObserver observer) {
        for (int i = 0; i< observers.size(); i++) {
            if (observers.get(i).getName() == observer.getName()) {
                observers.remove(i);
                return;
            }
        }
    }

    public void Notify() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update((Document) this);
            System.out.println("This document is signed(notification)");
        }
    }

}

