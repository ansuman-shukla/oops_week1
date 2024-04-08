package com.example.product.dto;

public class fakeStoreCartdto {
    long id;
    Long userId;
    String date;
    String  products;


    public String getProducts() {
        return  products;
    }
    public void setProducts(String products) {
        this. products = products;
    }

    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
}
