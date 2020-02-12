package com.noam.Entity;

public class Item {
    private int number;
    private String name;
    private int amount;
    private int inventoryCode;

    public Item(int number, String name, int amount, int inventoryCode) {
        this.number = number;
        this.name = name;
        this.amount = amount;
        this.inventoryCode = inventoryCode;
    }

    public Item(){}

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getInventoryCode() {
        return inventoryCode;
    }

    public void setInventoryCode(int inventoryCode) {
        this.inventoryCode = inventoryCode;
    }
}
