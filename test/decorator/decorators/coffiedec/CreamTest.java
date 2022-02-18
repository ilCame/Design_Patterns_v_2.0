package decorator.decorators.coffiedec;

import decorator.beverages.Beverage;
import decorator.beverages.coffiee.Decaf;
import decorator.beverages.coffiee.Espresso;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CreamTest {

    Beverage beverage;
    Cream cream;
    List<Cream> creamBeverage;

    @BeforeEach
    void setUp() {
        creamBeverage = new ArrayList<>();

        beverage = new Espresso();
        creamBeverage.add(cream = new Cream(beverage));

        beverage = new Decaf();

        creamBeverage.add(cream = new Cream(beverage));
    }

    @Test
    void costCream(){
        for (Cream drinkCream:this.creamBeverage) {
            if(drinkCream.beverage instanceof Espresso){
                assertEquals(1.50, drinkCream.cost());
            }else if(drinkCream.beverage instanceof Decaf)
                assertEquals(1.70, drinkCream.cost());
        }
    }

    @Test
    void getDescriptionCream() {
        for (Cream drinkCream:this.creamBeverage) {
            if(drinkCream.beverage instanceof Espresso){
                assertEquals("A normal espresso with Cream", drinkCream.getDescription());
            }else if(drinkCream.beverage instanceof Decaf)
                assertEquals("A decaffeinated coffee with Cream", drinkCream.getDescription());
        }
    }
}