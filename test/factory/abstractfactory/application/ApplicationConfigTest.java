package factory.abstractfactory.application;

import factory.abstractfactory.factory.GUIFactory;
import factory.abstractfactory.factory.specific.MacFactory;
import factory.abstractfactory.factory.specific.WinFactory;
import factory.abstractfactory.object.Button;
import factory.abstractfactory.object.impl.WinButton;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationConfigTest {
    ApplicationConfig app;
    GUIFactory winFactory, macFactory;
    Button button;

    String windows = "Windows";
    String mac = "Mac";

    String upperWindows = "WINDOWS";
    String upperMac = "MAC";

    String error = "Error";

    @BeforeEach
    public void setApp(){
        winFactory = new WinFactory();
        macFactory = new MacFactory();
        app = new ApplicationConfig();

    }


    @Test
    void configWithNormalStrings() throws ClassNotFoundException {
        app.config(windows);

        assertEquals(WinFactory.class, app.factory.getClass());

        app.config(mac);

        assertEquals(MacFactory.class, app.factory.getClass());
    }

    @Test
    void configWithUpperCaseStrings() throws ClassNotFoundException {
        app.config(upperWindows);

        assertEquals(WinFactory.class, app.factory.getClass());

        app.config(upperMac);

        assertEquals(MacFactory.class, app.factory.getClass());

    }

    @Test
    void configThrowsException() {
        try {
            app.config(error);
        }catch (ClassNotFoundException exception){
            assertEquals("Error: unknown system", exception.getMessage());
        }
    }

}