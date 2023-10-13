package com.example.jdbc_dao.repository;

import com.example.jdbc_dao.dao.ProductDAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;


import java.util.List;

import static com.example.jdbc_dao.utils.UtilitySQL.read;

@Repository
@RequiredArgsConstructor
public class ProductRepository implements ProductDAO {

    private final String scriptFindProduct = read("product_name.sql");

    @PersistenceContext
    private final EntityManager entityManager;

//    select o.product_name  from orders o where lower(customers.name) = lower(:name)
//    select product_name from orders o join customers c on c.id = o.customer_id where lower(c.name) = lower(:name)

    @Override
    public List<String> getProductName(String name) {
        String query = "select o.product_name  from orders o where lower(customers.name) = lower(:name)";
        return entityManager.createQuery(query, String.class)
                .setParameter("name", name)
                .getResultList();
    }

}
