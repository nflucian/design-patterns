package ro.neghina.pattern.decorator.condiment;

import ro.neghina.pattern.decorator.coffee.Beverage;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getName() {
        return beverage.getName() + ", Mocha";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 0.2;
    }
}
