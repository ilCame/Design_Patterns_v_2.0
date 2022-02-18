package factory.factorymethod;

import factory.factorymethod.dialog.AbstractDialog;
import factory.factorymethod.dialog.impl.WebDialog;
import factory.factorymethod.dialog.impl.WindowsDialog;

public class Application {
    private AbstractDialog abstractDialog;
    private String config;

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    public void initialize() throws ClassNotFoundException{
        if(getConfig().equals("Windows")){
            abstractDialog = new WindowsDialog();
        }else if(getConfig().equals("Web")){
            abstractDialog = new WebDialog();
        }else{
            throw new ClassNotFoundException("there is no class with name ---> " + getConfig());
        }
    }

    public void start() throws ClassNotFoundException {
        this.initialize();
        abstractDialog.render();
    }
}
