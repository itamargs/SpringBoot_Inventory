package com.itamar.Service;

import com.itamar.Dao.ItemDao;
import com.itamar.Entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;

// This class Exposes DB and methods for the REST controller
@Service
public class ItemService {

    @Autowired  //find ItemDao type, instantiate it and inject to here
    private ItemDao itemDao;

    public Collection<Item> getAllItems() {
        return itemDao.getAllItems();
    }

    public Item getItemByItem_no(int id) { //returns item for a given id
        return this.itemDao.getItemByItem_no(id);
    }


    public void deleteItemByItem_no(@PathVariable("id") int id) {
        itemDao.deleteItemByItem_no(id);
    }

    public void addItem(Item item) {
        itemDao.addItem(item);
    }

    public void withdraw(int item_no, int amount) { //reduce item amount quantity
        itemDao.withdraw(item_no, amount);
    }


    public void deposit(int item_no, int amount) {
        itemDao.deposit(item_no, amount);
    }
}
