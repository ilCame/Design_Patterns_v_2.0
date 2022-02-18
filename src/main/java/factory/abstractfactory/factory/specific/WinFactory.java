package factory.abstractfactory.factory.specific;

import factory.abstractfactory.factory.GUIFactory;
import factory.abstractfactory.object.Button;
import factory.abstractfactory.object.Checkbox;

public class WinFactory implements GUIFactory {
    Button winButton;
    Checkbox winCheckbox;

    @Override
    public Button createButton() {
        return winButton;
    }

    @Override
    public Checkbox createCheckbox() {
        return winCheckbox;
    }
}
