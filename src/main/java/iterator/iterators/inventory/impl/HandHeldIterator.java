package iterator.iterators.inventory.impl;

import iterator.inventories.impl.HandHeldInventory;
import iterator.items.impl.Item;
import iterator.iterators.inventory.InventoryIterator;

public class HandHeldIterator implements InventoryIterator {
    private HandHeldInventory handHeldInventory;
    private int index = 0;

    public HandHeldIterator(HandHeldInventory handHeldInventory) {
        this.handHeldInventory = handHeldInventory;
    }

    @Override
    public boolean hasNext() {
        return index<2;
    }

    @Override
    public void next() {index +=1;}

    @Override
    public Item current() {
        switch(index){
            case 0:
                return this.handHeldInventory.right;
            case 1:
                return this.handHeldInventory.left;
            case default:
                return null;
        }
    }
}
