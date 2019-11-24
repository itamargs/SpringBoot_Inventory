package com.itamar.Controller;

import com.itamar.Entity.Item;
import com.itamar.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

// This class Configures REST API

@RestController // let spring know that this is a Rest controller
@RequestMapping("/items")
public class ItemController {

    @Autowired  //find ItemService type, instantiate it and inject to here
    private ItemService itemService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Item> getAllItems() {
        return itemService.getAllItems();
    }

    //todo: handle cases when id from url isn't exist in DB
    @RequestMapping(value = "/{item_no}", method = RequestMethod.GET)
    public Item getItemByItem_no(@PathVariable("item_no") int item_no) { //get the 'id' from the url
        return itemService.getItemByItem_no(item_no);
    }

    @RequestMapping(value = "/{item_no}", method = RequestMethod.DELETE)
    public void removeItemByItem_no(@PathVariable("item_no") int item_no) {
        itemService.deleteItemByItem_no(item_no);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE) //let the url contain json
    public void addItem(@RequestBody Item item) { //get the body from the rest request (the body is in json)
        itemService.addItem(item);
    }


    // usage: localhost:8080/items/withdraw/?item_no=[item_no]&amount=[amount]
    @RequestMapping(value = "/withdraw", method = RequestMethod.POST)
    public void withdraw(@RequestParam int item_no, @RequestParam int amount) { //reduce item amount quantity
        itemService.withdraw(item_no, amount);
    }

    // usage: localhost:8080/items/withdraw/?item_no=[item_no]&amount=[amount]
    @RequestMapping(value = "/deposit", method = RequestMethod.POST)
    public void deposit(@RequestParam int item_no, @RequestParam int amount) { //reduce item amount quantity
        itemService.deposit(item_no, amount);
    }

}
