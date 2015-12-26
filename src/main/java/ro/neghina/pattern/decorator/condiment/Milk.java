package ro.neghina.pattern.decorator.condiment;

import ro.neghina.pattern.decorator.coffee.Beverage;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getName() {
        return beverage.getName() + ", Milk";
    }

    @Override
    public double getCost() {
        return 0.1 + beverage.getCost();
    }
}
