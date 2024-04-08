package com.example.product.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.product.dto.fakeStoreCartdto;
import com.example.product.service.CartServices;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {
    
    @Autowired
    CartServices cs;

    @GetMapping("/carts/")
    public fakeStoreCartdto[] getall() {
        return cs.getAllCarts();
    }


    @GetMapping("/carts/{id}/")
    public fakeStoreCartdto getCart(@PathVariable String id) {
        return cs.getCart(id);
    }

    @GetMapping("/carts/{start}/{end}/")
    public fakeStoreCartdto[] getinRange(@PathVariable String start , @PathVariable String end) {
        return cs.getinRange(start, end);
    }

    @GetMapping("/carts/user/{id}/")
    public fakeStoreCartdto[] getcart(@PathVariable int id) {
        return cs.getcart(id);
    }

}
