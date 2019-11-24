package com.itamar.Entity;

public class Item {
    private int item_no;
    private String name;
    private int amount;
    private String inventory_code;

    public Item(int item_no, String name, int amount, String inventory_code) {
        this.item_no = item_no;
        this.name = name;
        this.amount = amount;
        this.inventory_code = inventory_code;
    }

    public Item(){}

    public int getItem_no() {
        return item_no;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public String getInventory_code(){
        return inventory_code;
    }

    public void setItem_no(int item_no) {
        this.item_no = item_no;
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
