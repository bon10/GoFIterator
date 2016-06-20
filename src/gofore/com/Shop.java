package gofore.com;


public abstract class Shop {

    protected ItemList items;

    public abstract void getItemList();
    public abstract void setItemList();
    public abstract void cache();
}
