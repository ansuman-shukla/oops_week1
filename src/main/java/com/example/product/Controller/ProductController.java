package com.example.product.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.product.dto.fakeStoreProductdto;
import com.example.product.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class ProductController {
    
    @Autowired 
    ProductService ps;

    // @GetMapping("/products/")
    // public String hui( ) {
    //     return "working";
    // }

    @GetMapping("/products/")
    public fakeStoreProductdto[] getProduct() {
        return ps.getProduct();
    }


    
    @GetMapping("/products/{id}/")
    public fakeStoreProductdto getProduct(@PathVariable String id) {
        return ps.getProducts(id);
    }

    

}
