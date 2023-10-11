package com.example.jdbc_dao.repository;

import com.example.jdbc_dao.dao.ProductDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;


import java.util.List;

import static com.example.jdbc_dao.utils.UtilitySQL.read;

@Repository
@RequiredArgsConstructor
public class ProductRepository implements ProductDAO {

    private final String scriptFindProduct = read("product_name.sql");


    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public List<String> getProductName(String name) {
        MapSqlParameterSource sqlParameterSource = new MapSqlParameterSource("name", name);
        return namedParameterJdbcTemplate.queryForList(scriptFindProduct, sqlParameterSource, String.class);
    }

}
