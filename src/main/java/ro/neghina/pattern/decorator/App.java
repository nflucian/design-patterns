package ro.neghina.pattern.decorator;

import ro.neghina.pattern.decorator.coffee.Beverage;
import ro.neghina.pattern.decorator.coffee.DarkRoast;
import ro.neghina.pattern.decorator.coffee.Espresso;
import ro.neghina.pattern.decorator.condiment.Milk;
import ro.neghina.pattern.decorator.condiment.Mocha;

public class App {

    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        echo(espresso);

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Milk(darkRoast);
        darkRoast = new Mocha(darkRoast);

        echo(darkRoast);
    }

    public static void echo(Beverage beverage) {
        System.out.println(beverage.getName() + " $" + beverage.getCost());
    }
}
