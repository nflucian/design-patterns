package ro.neghina.pattern.observer;

public class SimpleDisplay implements Observer {

    public void sendNotify(String s) {
        System.out.println(s);
    }
}
