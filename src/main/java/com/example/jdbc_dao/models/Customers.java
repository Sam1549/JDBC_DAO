package com.example.jdbc_dao.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "customers",schema = "public")
@NoArgsConstructor
@AllArgsConstructor
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length =  50)
    private String name;
    @Column(length = 50)
    private String surname;
    private int age;
    @Column(length = 11)
    private String phone_number;
}
