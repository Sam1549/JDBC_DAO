package com.example.jdbc_dao.dao;



import java.util.List;


public interface ProductDAO {

    List<String> getProductName(String name);
}
