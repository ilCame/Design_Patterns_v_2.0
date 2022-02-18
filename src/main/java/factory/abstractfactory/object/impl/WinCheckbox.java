package factory.abstractfactory.object.impl;

import factory.abstractfactory.object.Checkbox;

public class WinCheckbox implements Checkbox {
    @Override
    public String paint() {
        return "Windows Style Checkbox";
    }
}
