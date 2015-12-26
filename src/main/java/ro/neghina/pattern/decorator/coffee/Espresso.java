package ro.neghina.pattern.decorator.coffee;

public class Espresso extends Beverage {

    public Espresso() {
        this.name = "Espresso";
    }

    @Override
    public double getCost() {
        return 1.99;
    }
}
