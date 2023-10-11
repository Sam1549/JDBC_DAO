package com.example.jdbc_dao.controller;

import com.example.jdbc_dao.service.ServiceProduct;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductsController {

    private final ServiceProduct serviceProduct;

    @GetMapping("/fetch-product")
    public List<String> fetchProduct(@RequestParam String name) {
        return serviceProduct.findProductByName(name);
    }

}
