package decorator.decorators.coffiedec;

import decorator.beverages.Beverage;
import decorator.decorators.AddOnDecorator;

public class Caramel extends AddOnDecorator {

    Beverage beverage;

    public Caramel(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 0.20;
    }

    @Override
    public String getDescription() {
        StringBuilder fullDescription = new StringBuilder();
        fullDescription.append(this.beverage.getDescription()).append("with Caramel");
        return fullDescription.toString();
    }
}
