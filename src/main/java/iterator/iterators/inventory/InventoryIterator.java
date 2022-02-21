package iterator.iterators.inventory;

import iterator.inventories.Inventory;
import iterator.items.impl.Item;

public interface InventoryIterator {
    boolean hasNext();
    void next();
    Item current();
}
