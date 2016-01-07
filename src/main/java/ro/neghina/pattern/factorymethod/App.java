package ro.neghina.pattern.factorymethod;

import ro.neghina.pattern.factory.Animal;

public class App {

    public static void main(String[] args) {
        AnimalPicker dogPicker = new DogPicker();
        Animal cat = dogPicker.pickAnimal();

        cat.speak();
    }
}
