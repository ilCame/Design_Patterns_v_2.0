package strategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import strategy.ducks.Duck;
import strategy.flybehaviour.FlyBehaviour;
import strategy.flybehaviour.JetFlyBehaviour;
import strategy.flybehaviour.NormalFlyBehaviour;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class ExampleStrategyTest {
    Duck duck;

    FlyBehaviour flyBehaviour;

    ExampleStrategy exampleStrategy = new ExampleStrategy();

    @BeforeEach
    void setUp() {
        duck = new Duck();
    }

    @Test
    void strategyJetDuck() {
        duck = exampleStrategy.selectStrategy("jetduck");
        flyBehaviour = duck.getFlyBehaviour();

        assertEquals(JetFlyBehaviour.class, flyBehaviour.getClass() );
    }

    @Test
    void strategyNormalDuck() {
        duck = exampleStrategy.selectStrategy("normalduck");
        flyBehaviour = duck.getFlyBehaviour();

        assertEquals(NormalFlyBehaviour.class, flyBehaviour.getClass() );
    }

    @Test
    void verifyLowerCaseOfBehaviourFunctionality(){
        duck = exampleStrategy.selectStrategy("jetDuck");
        flyBehaviour = duck.getFlyBehaviour();

        assertEquals(JetFlyBehaviour.class, flyBehaviour.getClass() );
        assertEquals("Jet fly quaack", flyBehaviour.Fly());

        duck = exampleStrategy.selectStrategy("normalduCk");
        flyBehaviour = duck.getFlyBehaviour();

        assertEquals(NormalFlyBehaviour.class, flyBehaviour.getClass() );
        assertEquals("Normal fly quack", flyBehaviour.Fly());
    }
}