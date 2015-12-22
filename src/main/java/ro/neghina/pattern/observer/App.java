package ro.neghina.pattern.observer;

public class App {

    public static void main(String[] args) {
        MessageData messageData = new MessageData();
        messageData.registerObserver(new SimpleDisplay());
        messageData.registerObserver(new CompletDisplay());

        messageData.setMessage("Salut Lucian");
    }
}
