package ro.neghina.pattern.decorator.coffee;

public abstract class Beverage {
    protected String name = "Unknown";

    public String getName() {
        return name;
    }

    public abstract double getCost();

}
