package com.itamar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

// Data Access Object
// This class Holds DB And operations


@Service //need to create a propper service
public class ItemDao {

    @Autowired
    private ItemRepository itemRepository;

//    private static Map<Integer, Item> items;


//    static {
//
//       items = new HashMap<Integer, Item>() {
//           {
//           put(1,new Item(1, "glass",14, "GLASS"));
//           put(2,new Item(2, "spoon",4, "SPOON"));
//           put(3,new Item(3, "fork",47, "FORK"));
//       }
//        };
//    }

    public List<Item> getAllItems() {  //return list of all the items in the inventory
        System.out.println("Check get all");
        System.out.println(itemRepository.findAll());
        return itemRepository.findAll();
    }


    //todo: return error if item dosent exists
    public Item getItemByItemNo(int itemNo) { //gets the item from the repository and returns it
        return itemRepository.findByItemNo(itemNo);
    }

    // todo: return error if amount to reduce is bigger then amount exists
    public void withdraw(int itemNo, int amount) { //reduce item amount quantity (withdrawal)
        Item item = getItemByItemNo(itemNo);
        item.setAmount(item.getAmount() - amount);
        itemRepository.save(item);
    }

    public void deposit(int itemNo, int amount) { //adds item amount quantity (deposit)
        System.out.println("int deposit: " + "itemNo: " + itemNo + ". amount: " + amount);
        Item item = getItemByItemNo(itemNo);
        item.setAmount(item.getAmount() + amount); //updates amount
        itemRepository.save(item); //save update to repository
    }

    public void addItem(Item item) { //add new item to DB
        Item newItem = new Item(item.getItemNo(), item.getName(), item.getAmount(), item.getInventory_code());
        System.out.println("Check add item");
        System.out.println(newItem.getName());
        itemRepository.save(newItem);
    }

    // todo: return error if item dosent exist
    public void deleteItemByItemNo(int itemNo) { //get itemNo and delete this item (delete item)
        itemRepository.deleteById(getItemByItemNo(itemNo).getId());
    }


}
