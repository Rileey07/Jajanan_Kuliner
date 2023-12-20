package com.example.jajanankuliner.model;

public class Data {
    private String id, name, type, price ,address;

    public Data(){

    }

    public Data(String id, String name, String type, String price, String address){
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
