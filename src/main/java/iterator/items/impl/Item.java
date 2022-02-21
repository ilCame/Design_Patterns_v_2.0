package iterator.items.impl;

import iterator.items.Items;

public class Item implements Items {
    String name;
    String type;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getType() {
        return this.type;
    }
}
