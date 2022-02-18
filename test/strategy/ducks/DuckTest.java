package strategy.ducks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import strategy.flybehaviour.FlyBehaviour;
import strategy.flybehaviour.JetFlyBehaviour;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class DuckTest {
    private final Duck duck = new Duck();

    private FlyBehaviour flyBehaviour;

    @Test
    void getFlyBehaviour() {
        FlyBehaviour jetFly = new JetFlyBehaviour();
        duck.setFlyBehaviour(jetFly);
        this.flyBehaviour = duck.getFlyBehaviour();

        assertEquals(flyBehaviour, jetFly);
    }

    @Test
    void setFlyBehaviour() {
        duck.setFlyBehaviour(flyBehaviour);

        assertEquals(flyBehaviour, duck.getFlyBehaviour());
    }

}