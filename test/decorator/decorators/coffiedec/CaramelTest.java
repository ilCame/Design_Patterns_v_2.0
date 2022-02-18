package decorator.decorators.coffiedec;

import decorator.beverages.Beverage;
import decorator.beverages.coffiee.Decaf;
import decorator.beverages.coffiee.Espresso;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaramelTest {

    Beverage espresso;
    Beverage decaffeinated;
    Caramel espressoCaramel;
    Caramel decafCaramel;

    @BeforeEach
    void setUp() {
        espresso = new Espresso();
        decaffeinated = new Decaf();

        espressoCaramel = new Caramel(espresso);
        decafCaramel = new Caramel(decaffeinated);
    }

    @Test
    void costEspresso() {

        assertEquals(1.20, espressoCaramel.cost());
    }

    @Test
    void costDecaf() {
        assertEquals(1.40, decafCaramel.cost());
    }

    @Test
    void getDescriptionEspresso() {
        assertEquals("A normal espresso with Caramel", espressoCaramel.getDescription());
    }

    @Test
    void getDescriptionDecaf() {
        assertEquals("A decaffeinated coffee with Caramel", decafCaramel.getDescription());
    }
}