package com.example.jdbc_dao.repository;

import com.example.jdbc_dao.dao.ProductDAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import java.util.List;



@Repository
@RequiredArgsConstructor
public class ProductRepository implements ProductDAO {



    @PersistenceContext
    private final EntityManager entityManager;



    @Override
    public List<String> getProductName(String name) {
        String query = "select o.product_name from Orders o where lower(o.customer.name)=lower(:name) ";
        return entityManager.createQuery(query, String.class)
                .setParameter("name",name)
                .getResultList();
    }

}
