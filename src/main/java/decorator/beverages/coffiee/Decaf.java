package decorator.beverages.coffiee;

import decorator.beverages.Beverage;

public class Decaf extends Beverage {

    @Override
    public double cost() {
        return 1.20;
    }

    @Override
    public String getDescription() {
        return "A decaffeinated coffee ";
    }
}
