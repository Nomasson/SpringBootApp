package com.noam.Dao;

import com.noam.Entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ItemDao {
    @Autowired
    private static Map<Integer, Item> Items;

    static{
        Items = new HashMap<Integer, Item>(){
            {
                put(1, new Item(1,"Bottle",5,8474));
                put(2, new Item(2,"Box",3,3456));
                put(3, new Item(3,"Ball",6,2234));
                put(4, new Item(4,"Lamp",10,2257));
                put(5, new Item(5,"Desk",22,8843));
                put(6, new Item(6,"Chair",3,4564));

            }
        };
    }

    public Collection<Item> getAllItems(){

        return this.Items.values();
    }

    public Item getItemById(int id){
        return this.Items.get(id);
    }


    public void removeStudentById(int id) {
        this.Items.remove(id);
    }

    public void insertItemToDb(Item item) {
        this.Items.put(item.getNumber(),item);
    }

    public void updateAmountById(int newAmount) {

    }

    public void updateItem(Item item) {
        Item updatedItem = Items.get(item.getNumber());
        updatedItem.setAmount(item.getAmount());
        Items.put(updatedItem.getNumber(),updatedItem);
    }
}
