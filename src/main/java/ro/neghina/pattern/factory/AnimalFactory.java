package ro.neghina.pattern.factory;

public abstract class AnimalFactory {

    public static Animal creatAnimal(AnimalType type) {
        switch(type) {
            case DOG:
                return new Dog();
            case CAT:
                return new Cat();
            default:
                return null;
        }
    }
}
