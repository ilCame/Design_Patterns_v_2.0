package decorator.beverages.coffiee;

import decorator.beverages.Beverage;

public class Espresso extends Beverage {

    @Override
    public double cost() {
        return 1.0;
    }

    @Override
    public String getDescription() {
        return "A normal espresso ";
    }
}
