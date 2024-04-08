package com.example.product.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.product.dto.fakeStoreProductdto;

@Service
public class ProductService {
    
    RestTemplate restTemplate = new RestTemplate();
    String url = "https://fakestoreapi.com/";


    public fakeStoreProductdto[] getProduct() {
        var response = restTemplate.getForObject(url + "/products/", fakeStoreProductdto[].class);
        return response;
    }

    public fakeStoreProductdto getProducts(String id) {
        var response = restTemplate.getForObject(url + "/products/"+  id, fakeStoreProductdto.class);
        return response;
    }
}
