package factory.factorymethod.dialog.impl;

import factory.factorymethod.button.Button;
import factory.factorymethod.button.impl.WindowsButton;
import factory.factorymethod.dialog.AbstractDialog;

public class WindowsDialog extends AbstractDialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
