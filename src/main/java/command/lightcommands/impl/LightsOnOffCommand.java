package command.lightcommands.impl;

import command.objects.Light;
import command.lightcommands.Command;

public class LightsOnOffCommand implements Command {
    private Light light;

    public LightsOnOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.on();
    }

    @Override
    public void unExecute() {
        this.light.off();
    }
}
