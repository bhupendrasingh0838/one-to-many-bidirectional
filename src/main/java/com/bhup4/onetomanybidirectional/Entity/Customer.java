package com.bhup4.onetomanybidirectional.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private String name;
    private String mobNumber;
    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    @JsonManagedReference
  //  @JoinColumn(name = "item_id")
    private List<Items> items =new ArrayList<>();

    public Customer() {
    }

    public Customer(int id, String name, String mobNumber, List<Items> items) {
        this.id = id;
        this.name = name;
        this.mobNumber = mobNumber;
        this.items = items;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobNumber() {
        return mobNumber;
    }

    public void setMobNumber(String mobNumber) {
        this.mobNumber = mobNumber;
    }

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }
}
