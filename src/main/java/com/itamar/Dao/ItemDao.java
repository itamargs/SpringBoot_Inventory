package com.itamar.Dao;

import com.itamar.Entity.Item;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


// This class Holds DB And operations

@Repository //let spring knows that this is our repository
public class ItemDao {

    private static Map<Integer, Item> items;


    static {

       items = new HashMap<Integer, Item>() {
           {
           put(1,new Item(1, "glass",14, "GLASS"));
           put(2,new Item(2, "spoon",4, "SPOON"));
           put(3,new Item(3, "fork",47, "FORK"));
       }
        };
    }

    public Collection<Item> getAllItems(){  //return list of all the items in the inventory
        return this.items.values();
    }


    //todo: return error if item dosent exists
    public Item getItemByItem_no(int id) { //returns item for a given id
    return this.items.get(id);
    }

    // todo: return error if amount to reduce is bigger then amount exists
    public void withdraw(int item_no, int amount){ //reduce item amount quantity (withdrawal)
        Item item = this.items.get(item_no);
        item.setAmount(item.getAmount()-amount);
    }

    public void deposit(int item_no, int amount) { //adds item amount quantity (deposit)
        Item item = this.items.get(item_no);
        item.setAmount(item.getAmount()+amount);
    }

    public void addItem(Item item){ //add new item to DB
        this.items.put(item.getItem_no(), item);
    }

    // todo: return error if item dosent exist
    public void deleteItemByItem_no(int id) { //get item_no and delete this item (delete item)
        this.items.remove(id);
    }






}
