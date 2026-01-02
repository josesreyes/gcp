package com.jsrdev.hello.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {
    @GetMapping
    public String index() {
        return "All products";
    }

    @GetMapping("/id")
    public String id() {
        return "Product ID";
    }

    @GetMapping("/id2")
    public String id2() {
        return "Product ID 02";
    }

    @PostMapping
    public ResponseEntity<ProductResponse> createProduct(@RequestBody AddProductRequest productRequest) {
        return ResponseEntity.ok();
    }

}
