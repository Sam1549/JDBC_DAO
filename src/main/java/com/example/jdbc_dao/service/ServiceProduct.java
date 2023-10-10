package com.example.jdbc_dao.service;

import com.example.jdbc_dao.dao.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceProduct {
    @Autowired
    ProductDAO productDAO;

    public List<String> findProductByName(String name){
        return productDAO.getProductName(name);
    }
}
