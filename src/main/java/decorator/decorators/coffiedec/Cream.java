package decorator.decorators.coffiedec;

import decorator.beverages.Beverage;
import decorator.decorators.AddOnDecorator;

public class Cream extends AddOnDecorator {

    Beverage beverage;

    public Cream(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 0.50;
    }

    @Override
    public String getDescription() {
        StringBuilder fullDescription = new StringBuilder();
        fullDescription.append(this.beverage.getDescription()).append("with Cream");
        return fullDescription.toString();
    }
}
