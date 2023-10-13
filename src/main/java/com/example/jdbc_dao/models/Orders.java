package com.example.jdbc_dao.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@NoArgsConstructor
@Entity
@Table(name = "orders", schema = "public")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate date;
    @Column(length = 100)
    private String product_name;
    private int amount;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customers customer;
}