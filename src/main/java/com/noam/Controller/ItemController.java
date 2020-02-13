package com.noam.Controller;

import com.noam.Entity.Item;
import com.noam.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
@RestController
@RequestMapping("/items")
public class ItemController {
    @Autowired
    private ItemService ItemService;

    //List of the inventory items list
    @RequestMapping(method = RequestMethod.GET)
    public Collection<Item> getAllItems(){
        return ItemService.getAllItems();
    }

    //Read item details
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Item getItemById(@PathVariable("id") int id){
        return ItemService.getItemById(id);
    }

    //Delete an item from stock
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteItemById(@PathVariable("id") int id){
        ItemService.removeItemById(id);
    }

    //Add item to stock
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertItem(@RequestBody Item item){
        ItemService.insertItem(item);
    }


    //Withdrawal quantity of a specific item from stock
    //Deposit quantity of a specific item to stock
    //Which is basically updating the stock of a specific item
    @RequestMapping(method = RequestMethod.PUT)
        public void updateItemById(@RequestBody Item item){
            ItemService.updateItem(item);
        }





}
