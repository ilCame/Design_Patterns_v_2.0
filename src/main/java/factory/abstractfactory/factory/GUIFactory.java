package factory.abstractfactory.factory;

import factory.abstractfactory.object.Button;
import factory.abstractfactory.object.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
