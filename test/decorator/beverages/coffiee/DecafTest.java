package decorator.beverages.coffiee;

import decorator.beverages.Beverage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecafTest {

    Beverage decaffeinated;

    @BeforeEach
    void setUp() {
        decaffeinated = new Decaf();
    }

    @Test
    void cost() {
        assertEquals(1.2, decaffeinated.cost());
    }

    @Test
    void getDescription() {
        assertEquals("A decaffeinated coffee ", decaffeinated.getDescription());
    }
}