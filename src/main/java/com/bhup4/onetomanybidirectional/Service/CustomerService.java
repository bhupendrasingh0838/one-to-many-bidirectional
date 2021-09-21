package com.bhup4.onetomanybidirectional.Service;

import com.bhup4.onetomanybidirectional.Entity.Customer;

import java.util.List;

public interface CustomerService {

    public List<Customer> getAll();

    public Customer getData(int id);

    public String create(Customer customer);

    public void delete(int id);

    public Customer update(int id,Customer customer);


}
