package ro.neghina.pattern.observer;

import java.util.Date;

public class CompletDisplay implements Observer {
    public void sendNotify(String s) {
        Date date = new Date();
        System.out.println(date.toString() + " : " + s);
    }
}
