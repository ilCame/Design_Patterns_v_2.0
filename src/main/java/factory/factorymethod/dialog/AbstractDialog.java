package factory.factorymethod.dialog;

import factory.factorymethod.button.Button;

public abstract class AbstractDialog {

    public abstract Button createButton();

    public void render(){
        Button okButton = createButton();
        String closeDialog = "closed";

        okButton.onClick(closeDialog);
        okButton.render();
    }
}
