package ro.neghina.pattern.factorymethod;

import ro.neghina.pattern.factory.Animal;
import ro.neghina.pattern.factory.Dog;

public class DogPicker extends AnimalPicker {

    @Override
    protected Animal createAnimal() {
        return new Dog();
    }
}
