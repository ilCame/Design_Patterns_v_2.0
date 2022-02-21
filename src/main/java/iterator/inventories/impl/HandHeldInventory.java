package iterator.inventories.impl;

import iterator.inventories.Inventory;
import iterator.items.impl.Item;
import iterator.iterators.inventory.InventoryIterator;
import iterator.iterators.inventory.impl.HandHeldIterator;

public class HandHeldInventory implements Inventory {
    public Item right;
    public Item left;
    public HandHeldIterator HandHeldIterator;

    private void setRight(Item right) {
        this.right = right;
    }

    private void setLeft(Item left) {
        this.left = left;
    }

    public HandHeldInventory(Item right, Item left) {
        this.right = right;
        this.left = left;
    }

    @Override
    public InventoryIterator getIterator() {
        return HandHeldIterator = new HandHeldIterator(this);
    }
}
