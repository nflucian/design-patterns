package ro.neghina.pattern.factorymethod;

import ro.neghina.pattern.factory.Animal;
import ro.neghina.pattern.factory.Cat;

public class CatPicker extends AnimalPicker {

    @Override
    protected Animal createAnimal() {
        return new Cat();
    }
}
