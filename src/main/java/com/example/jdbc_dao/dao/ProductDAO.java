package com.example.jdbc_dao.dao;

import org.springframework.stereotype.Component;

import java.util.List;


public interface ProductDAO {

   List<String> getProductName(String name);
}
