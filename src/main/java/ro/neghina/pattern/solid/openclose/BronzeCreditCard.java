package ro.neghina.pattern.solid.openclose;

public class BronzeCreditCard extends CreditCard {

    public double getDiscount(double monthlyCost){
        return monthlyCost * 0.01;
    }
}