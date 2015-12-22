package ro.neghina.pattern.observer;

import java.util.ArrayList;

public class MessageData implements Subject {
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private String message;

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i >=0 ) {
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        for(Observer o : observers) {
            o.sendNotify(message);
        }
    }

    public void setMessage(String message) {
        this.message = message;
        notifyObservers();
    }
}
