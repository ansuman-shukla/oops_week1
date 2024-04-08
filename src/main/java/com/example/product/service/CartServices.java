package com.example.product.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.product.dto.fakeStoreCartdto;

@Service
public class CartServices {
    
    RestTemplate restTemplate = new RestTemplate();
    String url = "https://fakestoreapi.com/";

    public fakeStoreCartdto getCart(String id) {
        var response = restTemplate.getForObject(url + "carts/" + id, fakeStoreCartdto.class);
        System.out.println(response);
        return response;
    }

    public fakeStoreCartdto[] getAllCarts() {
        var response = restTemplate.getForObject(url + "carts/", fakeStoreCartdto[].class);
        System.out.println(response);
        return response;
    }

    //https://fakestoreapi.com/carts?startdate=2019-12-10&enddate=2020-10-10

    public fakeStoreCartdto[] getinRange(String start , String end) {
        var response = restTemplate.getForObject(url + "carts" + "?" +"startdate=" + start + "&enddate=" + end, fakeStoreCartdto[].class);
        return response;
    }

    public fakeStoreCartdto[] getcart(int id) {
        var response = restTemplate.getForObject(url + "carts/user/" + id, fakeStoreCartdto[].class);
        return response;
    }

   



}
