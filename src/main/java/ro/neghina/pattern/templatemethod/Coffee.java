package ro.neghina.pattern.templatemethod;

public class Coffee extends CaffeineBeverage {
    @Override
    protected void brew() {
        System.out.println("Dropping the coffee through filter");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
