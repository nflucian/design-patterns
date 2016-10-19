package ro.neghina.pattern.solid.openclose;

public class GoldCreditCard extends CreditCard {

    public double getDiscount(double monthlyCost){
        return monthlyCost * 0.02;
    }
}