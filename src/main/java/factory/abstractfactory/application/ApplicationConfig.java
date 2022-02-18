package factory.abstractfactory.application;

import factory.abstractfactory.factory.GUIFactory;
import factory.abstractfactory.factory.specific.MacFactory;
import factory.abstractfactory.factory.specific.WinFactory;

public class ApplicationConfig {
    GUIFactory factory;
    Application application;

    public void config(String config)throws ClassNotFoundException{

        if(config.equalsIgnoreCase("windows")){
            factory = new WinFactory();
        } else if(config.equalsIgnoreCase("mac")){
            factory = new MacFactory();
        }else{
            throw new ClassNotFoundException("Error: unknown system");
        }

        application = new Application(factory);
    }
}
