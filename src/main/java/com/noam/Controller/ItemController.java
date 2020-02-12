package com.noam.Controller;

import com.noam.Entity.Item;
import com.noam.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
@RestController
@RequestMapping("/items")
public class ItemController {
    @Autowired
    private ItemService ItemService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Item> getAllItems(){
        return ItemService.getAllItems();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Item getItemById(@PathVariable("id") int id){
        return ItemService.getItemById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteItemById(@PathVariable("id") int id){
        ItemService.removeItemById(id);
    }
}
