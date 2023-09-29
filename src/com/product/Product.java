package com.product;

public class Product {
    private long id;
    private double price;

    Product(long id, double price) {
        this.id = id;
        this.price = price;
    }


    public long getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    void increasePriceBy(double amount){
        this.price += amount;
    }



    @Override
    public String toString() {
        return " id=" + id + ", price=" + price ;
    }
}
