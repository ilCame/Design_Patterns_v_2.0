package factory.factorymethod;

import factory.factorymethod.dialog.impl.WebDialog;
import factory.factorymethod.dialog.impl.WindowsDialog;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {
    private Application application;

    @BeforeEach
    void setUp() {
        application = new Application();
    }

    @Test
    void setConfig() {
        application.setConfig("Windows");
        assertEquals("Windows", application.getConfig());
    }

    @Test
    void initialize() throws ClassNotFoundException {
        application.setConfig("Windows");
        application.initialize();
        assertEquals(WindowsDialog.class, application.abstractDialog.getClass());

        application.setConfig("Web");
        application.initialize();
        assertEquals(WebDialog.class, application.abstractDialog.getClass());
    }

    @Test
    void start() throws ClassNotFoundException {
        application.setConfig("Windows");
        application.start();
    }
}