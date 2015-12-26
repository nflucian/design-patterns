package ro.neghina.pattern.decorator.condiment;

import ro.neghina.pattern.decorator.coffee.Beverage;

public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public abstract String getName();
}
