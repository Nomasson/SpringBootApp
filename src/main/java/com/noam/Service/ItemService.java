package com.noam.Service;

import com.noam.Dao.ItemDao;
import com.noam.Entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
public class ItemService {
    @Autowired
    private ItemDao ItemDao;

    public Collection<Item> getAllItems(){
        return this.ItemDao.getAllItems();
    }
    public Item getItemById(int id){
        return this.ItemDao.getItemById(id);
    }

    public void removeItemById(int id){
        this.ItemDao.removeStudentById(id);
    }

    public void insertItem(Item item) {
        ItemDao.insertItemToDb(item);
    }

    public void updateAmountById(int id, int newAmount) {
        ItemDao.updateAmountById(newAmount);
    }

    public void updateAmountById(int newAmount) {
    }

    public void updateItem(Item item) {
        ItemDao.updateItem(item);
    }
}
