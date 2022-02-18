package factory.abstractfactory.object.impl;

import factory.abstractfactory.object.Checkbox;

public class MacCheckbox implements Checkbox {
    @Override
    public String paint() {
        return "Mac Style Checkbox";
    }
}
