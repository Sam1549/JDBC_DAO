package com.example.jdbc_dao.service;

import com.example.jdbc_dao.dao.ProductDAO;
import com.example.jdbc_dao.models.Orders;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
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
