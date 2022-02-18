package decorator.decorators;

import decorator.beverages.Beverage;

public abstract class AddOnDecorator extends Beverage {
    @Override
    public abstract double cost();

    @Override
    public abstract String getDescription();
}
