package com.bhup4.onetomanybidirectional.Repository;

import com.bhup4.onetomanybidirectional.Entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,Integer> {
}
