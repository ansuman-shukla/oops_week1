package com.example.product.dto;


public class fakeStoreProductdto {
    Long id;
    Long userId;
    String date;
    String product;
    String title;
    double price;
    String description;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
        System.out.println();
    }

    public String getTitle() {
        System.out.println();
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        System.out.println();
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        System.out.println();
        return description;
    }   

    public void setDescription(String description) {
        this.description = description;
    }
    
    

}
