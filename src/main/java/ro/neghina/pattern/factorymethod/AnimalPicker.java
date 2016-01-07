package ro.neghina.pattern.factorymethod;

import ro.neghina.pattern.factory.Animal;

public abstract class AnimalPicker {

    protected abstract Animal createAnimal();

    public Animal pickAnimal() {
        return createAnimal();
    }
}
