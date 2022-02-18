package command.invokers;

import command.lightcommands.Command;
import command.lightcommands.impl.LightsOnOffCommand;
import command.objects.Light;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoteLightTest {
    Light light = new Light();
    Command on = new LightsOnOffCommand(light);
    Command off = new LightsOnOffCommand(light);
    RemoteLight remoteLight;

    @BeforeEach
    void setUp() {
        remoteLight = new RemoteLight(on, off);
    }

    @Test
    void clickOn() {
        remoteLight.clickOn();
        assertTrue(light.lightOnOff);
    }

    @Test
    void clickOff() {
        remoteLight.clickOff();
        assertFalse(light.lightOnOff);
    }
}