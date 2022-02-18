package singleton;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {
    Singleton singleton;
    Singleton secondSingleton;

    @BeforeEach
    void setUp() {
        singleton = Singleton.getInstance();
        secondSingleton = Singleton.getInstance();
    }

    @Test
    void calculations() {
        assertEquals(4, singleton.calculations(1, 3));
    }

    @Test
    void onlyOneSingleton(){
        assertEquals(singleton, secondSingleton);
    }
}