package factory.factorymethod.dialog.impl;

import factory.factorymethod.button.Button;
import factory.factorymethod.button.impl.WebButton;
import factory.factorymethod.dialog.AbstractDialog;

public class WebDialog extends AbstractDialog {
    @Override
    public Button createButton() {
        return new WebButton();
    }
}
