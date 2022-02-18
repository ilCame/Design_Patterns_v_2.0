package factory.abstractfactory.object.impl;

import factory.abstractfactory.object.Button;

public class WinButton implements Button {

    @Override
    public String paint() {
        return "Windows Style Button";
    }
}
