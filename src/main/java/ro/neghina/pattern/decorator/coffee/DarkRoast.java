package ro.neghina.pattern.decorator.coffee;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        this.name = "Dark Roast";
    }

    @Override
    public double getCost() {
        return 1;
    }
}
