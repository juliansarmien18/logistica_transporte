package com.example.ingeneo.models;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "product_type")
public class ProductTypeModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    @Column(length = 20,nullable = false)
    private String name;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name="product_type_id",nullable = false)
    private List<ClientProductLogisticModel> client_product_logistic_type;


    public List<ClientProductLogisticModel> getClient_product_logistic_type() {
        return client_product_logistic_type;
    }

    public void setClient_product_logistic_type(List<ClientProductLogisticModel> client_product_logistic_type) {
        this.client_product_logistic_type = client_product_logistic_type;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
