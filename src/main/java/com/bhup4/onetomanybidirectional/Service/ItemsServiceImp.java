package com.bhup4.onetomanybidirectional.Service;

import com.bhup4.onetomanybidirectional.Entity.Customer;
import com.bhup4.onetomanybidirectional.Entity.Items;
import com.bhup4.onetomanybidirectional.Repository.ItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemsServiceImp implements ItemsService{
    @Autowired
    ItemsRepository repository1;

    @Override
    public List<Items> getAllItem() {
        return (List<Items>) repository1.findAll();
    }

    @Override
    public Items getDataItem(int id) {
        return repository1.findById(id).get();
    }

    @Override
    public String createItem(Items items) {
        repository1.save(items);
        return "Data Created";
    }

    @Override
    public void deleteItem(int id) {
        repository1.deleteById(id);

    }

    @Override
    public Items updateItem(int id, Items items) {
        Items items1 = repository1.findById(id).get();
        items1.setItemName(items.getItemName());
        items1.setRupee(items.getRupee());
        repository1.save(items1);
        return items1;



        }


    }

