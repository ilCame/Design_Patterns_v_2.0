package decorator.beverages.coffiee;

import decorator.beverages.Beverage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EspressoTest {

    Beverage espresso;

    @BeforeEach
    void setUp() {
        espresso = new Espresso();
    }

    @Test
    void cost() {
        assertEquals(1.0, espresso.cost());
    }

    @Test
    void getDescription() {
        assertEquals("A normal espresso ", espresso.getDescription());
    }
}