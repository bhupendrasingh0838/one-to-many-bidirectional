package com.bhup4.onetomanybidirectional.Repository;

import com.bhup4.onetomanybidirectional.Entity.Items;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemsRepository extends CrudRepository<Items,Integer> {
}
