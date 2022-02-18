package factory.abstractfactory.application;

import factory.abstractfactory.factory.GUIFactory;
import factory.abstractfactory.object.Button;

public class Application {
    private GUIFactory factory;
    private Button button;

    public Application(GUIFactory factory) {
        this.factory = factory;
    }

    public void createUI(){
        this.button = factory.createButton();
    }

    public String paint(){
        return this.button.paint();
    }


}
