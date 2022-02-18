package command.invokers;

import command.lightcommands.Command;

public class RemoteLight {
    Command on;
    Command off;

    public RemoteLight(Command on, Command off) {
        this.on = on;
        this.off = off;
    }

    public void clickOn(){
        this.on.execute();
    }

    public void clickOff(){
        this.off.unExecute();
    }
}
