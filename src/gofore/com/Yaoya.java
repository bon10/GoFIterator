package gofore.com;

import gofore.com.Iterator;

public class Yaoya extends Shop{

    private ItemList items = new ItemList();

    public Yaoya(){
        items.addItem(new Item("人参",80));
        items.addItem(new Item("じゃがいも",60));
        items.addItem(new Item("たまねぎ",95));
    }

    public void getItemList(){
        Iterator itr = items.iterator();
        while(itr.hasNext()){
            Item item = (Item) itr.next();
            System.out.println(item.getName() + ":" + item.getPrice() + "円");
        }
    }

    @Override
    public void setItemList() {
        // TODO 自動生成されたメソッド・スタブ
      //未実装
    }

    @Override
    public void cache() {
        // TODO 自動生成されたメソッド・スタブ
        //未実装
    }
}
