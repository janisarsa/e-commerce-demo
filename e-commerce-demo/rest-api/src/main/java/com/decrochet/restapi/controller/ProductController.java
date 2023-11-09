package com.decrochet.restapi.controller;

import com.decrochet.restapi.model.User;
import com.decrochet.restapi.service.ProductService;
import com.decrochet.restapi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor

public class ProductController {
    
    private final ProductService productService;
    
    @PostMapping
    public ResponseEntity save(@RequestBody Product product) {
        User savedProduct = productService.save(product);

        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Product>> getAll() {
        List<Product> products = productService.getAll();

        if (products == null || products.size() < 1) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(products, HttpStatus.OK);
    }

}
