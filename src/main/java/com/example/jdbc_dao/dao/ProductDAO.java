package com.example.jdbc_dao.dao;



import com.example.jdbc_dao.models.Orders;

import java.util.List;


public interface ProductDAO {

    List<String> getProductName(String name);
}
