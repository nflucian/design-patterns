package ro.neghina.pattern.factory;

public class App {
    public static void main(String[] args) {
        Animal animal = AnimalFactory.creatAnimal(AnimalType.CAT);

        animal.speak();
    }
}
