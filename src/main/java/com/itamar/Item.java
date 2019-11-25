package com.itamar;

import javax.persistence.*;

// here we creating JPA entity

@Entity // indicates that it is a JPA entity.
@Table(name = "items")
public class Item {
    @Id //it is the object's auto-generated primary key
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int itemNo;
    private String name;
    private int amount;
    private String inventory_code;

    public Item(int itemNo, String name, int amount, String inventory_code) {
        this.itemNo = itemNo;
        this.name = name;
        this.amount = amount;
        this.inventory_code = inventory_code;
    }

    public Item(){}


    public int getId() {
        return id;
    }

    @Column(name = "itemNo", nullable = false) // indicates to JPA that this is ac column
    public int getItemNo() {
        return itemNo;
    }

    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }

    @Column(name = "amount", nullable = false)
    public int getAmount() {
        return amount;
    }

    @Column(name = "inventory_code", nullable = false)
    public String getInventory_code(){
        return inventory_code;
    }

    public void setItemNo(int itemNo) {
        this.itemNo = itemNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setInventory_code(String inventory_code) {
        this.inventory_code = inventory_code;
    }
}
