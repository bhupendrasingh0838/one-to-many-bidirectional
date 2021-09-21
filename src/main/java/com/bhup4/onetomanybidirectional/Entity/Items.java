package com.bhup4.onetomanybidirectional.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class Items {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String itemName;
    private String rupee;
    @ManyToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name = "cust_id")
    @JsonBackReference
    private Customer customer;

    public Items() {
    }

    public Items(int id, String itemName, String rupee, Customer customer) {
        this.id = id;
        this.itemName = itemName;
        this.rupee = rupee;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getRupee() {
        return rupee;
    }

    public void setRupee(String rupee) {
        this.rupee = rupee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
