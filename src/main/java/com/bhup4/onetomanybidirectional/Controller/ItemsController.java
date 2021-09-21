package com.bhup4.onetomanybidirectional.Controller;

import com.bhup4.onetomanybidirectional.Entity.Items;
import com.bhup4.onetomanybidirectional.Service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemsController {
    @Autowired
    ItemsService service1;

    @GetMapping("/getDataItem")
    public List<Items> getAllItem(){
        return (List<Items>) service1.getAllItem();
    }

    @GetMapping("/getDataLAP/{id}")
    public Items getDataItem(@PathVariable int id){
        Items items= service1.getDataItem(id);
        return items;
    }
    @PostMapping("/createItem")
    public String createItem(@RequestBody Items items){
        service1.createItem(items);
        return "Data Successfully Created";
    }
    @DeleteMapping("/deleteItem/{id}")
    public String  deleteItem(@PathVariable int id){
        service1.deleteItem(id);
        return "Delete Data Successfully";
    }
    @PutMapping("/updateItem/{id}")
    public Items updateItem(@PathVariable int id, @RequestBody Items items){
        service1.updateItem(id,items);
        return items;

    }
}
