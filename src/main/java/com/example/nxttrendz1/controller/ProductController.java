package com.example.nxttrendz1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import com.example.nxttrendz1.service.ProductJpaService;
import com.example.nxttrendz1.model.Product;

@RestController
public class ProductController {
    @Autowired
    private ProductJpaService jpaService;

    @GetMapping("/products")
    public ArrayList<Product> getProducts() {
        return jpaService.getProducts();
    }

    @PostMapping(value = "/products2")
    public Product addProduct(Product product) {
        System.out.println("addProduct" + product);
        return jpaService.addProduct(product);
    }

    @RequestMapping(value = "/products3", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Product addProduct3(@RequestBody Product product) {
        System.out.println("addProduct3" + product);
        return jpaService.addProduct(product);
    }
}