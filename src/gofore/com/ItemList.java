package gofore.com;

import java.util.ArrayList;
import java.util.List;

import gofore.com.Aggregate;
import gofore.com.Iterator;

public class ItemList implements Aggregate{

    private List<Item> items = new ArrayList<Item>();
    public void addItem(Item item) {
        items.add(item);
    }
    public int getSize() {
        return items.size();
    }
    public Item getItemAt(int index) {
        return (Item) items.get(index);
    }

    @Override
    public Iterator iterator() {
        return new ItemListIterator(this);
    }

}
