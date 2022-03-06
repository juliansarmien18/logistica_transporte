package com.example.ingeneo.models;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "logistic_type")
public class LogisticTypeModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    @Column(length = 20,nullable = false)
    private String name;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name="logistic_type_id",nullable = false)
    private List<StoragePlaceModel> storage_place;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name="logistic_type_id",nullable = false)
    private List<ClientProductLogisticModel> client_product_logistic_type;

    public List<ClientProductLogisticModel> getClient_product_logistic_type() {
        return client_product_logistic_type;
    }

    public void setClient_product_logistic_type(List<ClientProductLogisticModel> client_product_logistic_type) {
        this.client_product_logistic_type = client_product_logistic_type;
    }

    public List<StoragePlaceModel> getStorage_place() {
        return storage_place;
    }

    public void setStorage_place(List<StoragePlaceModel> storage_place) {
        this.storage_place = storage_place;
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
