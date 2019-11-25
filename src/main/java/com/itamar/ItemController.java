package com.itamar;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

// This class Configures REST API

@RestController // let spring know that this is a Rest controller
@RequestMapping("/items")
public class ItemController {

    @Autowired  //find ItemService type, instantiate it and inject to here
    private ItemDao itemDao;

    // get all item in inventory
    @ApiOperation(value = "Get list of all items", notes = "", response = Item.class)
    @RequestMapping(method = RequestMethod.GET)
    public List<Item> getAllItems() {
        return itemDao.getAllItems();
    }

    // get single item by its itemNo
    //todo: handle cases when id from url isn't exist in DB
    @ApiOperation(value = "Get specific item from the inventory given 'itemNo'", notes = "", response = Item.class)
    @RequestMapping(value = "/{itemNo}", method = RequestMethod.GET)
    public Item getItemByItemNo(@PathVariable("itemNo") int itemNo) { //get the 'id' from the url
        return itemDao.getItemByItemNo(itemNo);
    }

    // remove single item by its itemNo
    @ApiOperation(value = "Delete specific item from inventory", notes = "", response = Item.class)
    @RequestMapping(value = "/{itemNo}", method = RequestMethod.DELETE)
    public void removeItemByItemNo(@PathVariable("itemNo") int itemNo) {
        itemDao.deleteItemByItemNo(itemNo);
    }

    // add new item (by give Item to rest API)
    @ApiOperation(value = "Add new item (by give Item object)", notes = "", response = Item.class)
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE) //let the url contain json
    public void addItem(@RequestBody Item item) { //get the body from the rest request (the body is in json)
        itemDao.addItem(item);
    }


    // remove amount of quantity by given itemNo and amount
    // usage: localhost:8080/items/withdraw/?itemNo=[itemNo]&amount=[amount]
    @ApiOperation(value = "Removes amount of quantity by given itemNo and amount", notes = "", response = Item.class)
    @RequestMapping(value = "/withdraw", method = RequestMethod.POST)
    public void withdraw(@RequestParam int itemNo, @RequestParam int amount) { //reduce item amount quantity
        itemDao.withdraw(itemNo, amount);
    }

    // add amount of quantity by given itemNo and amount
    // usage: localhost:8080/items/deposit/?itemNo=[itemNo]&amount=[amount]
    @ApiOperation(value = "Adds amount of quantity by given itemNo and amount", notes = "", response = Item.class)
    @RequestMapping(value = "/deposit", method = RequestMethod.POST)
    public void deposit(@RequestParam int itemNo, @RequestParam int amount) { //add amount to item quantity
        itemDao.deposit(itemNo, amount);
    }

}
