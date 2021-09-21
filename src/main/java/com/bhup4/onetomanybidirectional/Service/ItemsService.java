package com.bhup4.onetomanybidirectional.Service;

import com.bhup4.onetomanybidirectional.Entity.Customer;
import com.bhup4.onetomanybidirectional.Entity.Items;

import java.util.List;

public interface ItemsService {

    public List<Items> getAllItem();

    public Items getDataItem(int id);

    public String createItem(Items items);

    public void deleteItem(int id);

    public Items updateItem(int id,Items items);



}
