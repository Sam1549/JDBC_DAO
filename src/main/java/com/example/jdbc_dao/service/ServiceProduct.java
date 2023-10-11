package com.example.jdbc_dao.service;

import com.example.jdbc_dao.dao.ProductDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ServiceProduct {

    private final ProductDAO productDAO;

    public List<String> findProductByName(String name) {
        return productDAO.getProductName(name);
    }
}
