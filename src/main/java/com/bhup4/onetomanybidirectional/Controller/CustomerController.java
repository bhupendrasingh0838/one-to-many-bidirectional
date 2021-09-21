package com.bhup4.onetomanybidirectional.Controller;

import com.bhup4.onetomanybidirectional.Entity.Customer;
import com.bhup4.onetomanybidirectional.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    CustomerService service;

    @GetMapping("/getData")
    public List<Customer> getAll(){
        return (List<Customer>) service.getAll();
    }



    @GetMapping("/getData/{id}")
    public Customer getAll(@PathVariable int id){
        Customer customer = service.getData(id);
        return customer;
    }

    @PostMapping("/create")
    public String create(@RequestBody Customer customer){
        service.create(customer);
        return "Data Added Successfully";

    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        service.delete(id);
        return "Data Deleted";
    }
    @PutMapping("/update/{id}")
    public Customer update(@PathVariable int id,@RequestBody Customer customer)
    {
        service.update(id,customer);
        return  customer;
    }
}
