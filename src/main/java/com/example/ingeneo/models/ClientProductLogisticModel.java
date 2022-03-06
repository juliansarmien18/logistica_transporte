package com.example.ingeneo.models;
import javax.persistence.*;

@Entity
@Table(name = "client_product_logistic_type")
public class ClientProductLogisticModel {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

}
