package gofore.com;

public class ItemListIterator implements Iterator {

    private ItemList itemList;
    private int index;

    public ItemListIterator(ItemList list){
        this.itemList = list;
        this.index = 0;
    }
    @Override
    public boolean hasNext() {
        if (index < itemList.getSize()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {
        return itemList.getItemAt(index++);
    }

}
