package com.bhup4.onetomanybidirectional.Service;

import com.bhup4.onetomanybidirectional.Entity.Customer;
import com.bhup4.onetomanybidirectional.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImp implements CustomerService {
    @Autowired
    CustomerRepository repository;
    
    @Override
    public List<Customer> getAll() {
        return (List<Customer>) repository.findAll();
    }

    @Override
    public Customer getData(int id) {
        return repository.findById(id).get();
    }

    @Override
    public String create(Customer customer) {
        repository.save(customer);
        return "Data Created";
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);

    }

    @Override
    public Customer update(int id, Customer customer) {
        Customer customer1 = repository.findById(id).get();
        customer1.setName(customer.getName());
        customer1.setMobNumber(customer.getMobNumber());
        repository.save(customer1);
        return customer1;

    }


}
