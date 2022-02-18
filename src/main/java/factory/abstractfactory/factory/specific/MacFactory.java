package factory.abstractfactory.factory.specific;

import factory.abstractfactory.factory.GUIFactory;
import factory.abstractfactory.object.Button;
import factory.abstractfactory.object.Checkbox;

public class MacFactory implements GUIFactory {
    Button macButton;
    Checkbox macCheckbox;

    @Override
    public Button createButton() {
        return macButton;
    }

    @Override
    public Checkbox createCheckbox() {
        return macCheckbox;
    }
}
