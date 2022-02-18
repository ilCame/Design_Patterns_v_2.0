package factory.abstractfactory.object.impl;

import factory.abstractfactory.object.Button;

public class MacButton implements Button {
    @Override
    public String paint() {
        return "Mac Style Button";
    }
}
