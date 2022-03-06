package com.example.ingeneo.models;

import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "client")
public class ClientModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    
    @Column(unique = true,nullable = false)
    private Long document_number;
    
    @Column(nullable = false,length = 20)
    private String first_name;

    @Column(nullable = false,length = 20)
    private String lastname;

    @Column(unique = true,nullable = false,length = 60)
    private String email;

    @Column(nullable = false,length = 15)
    private String password;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name="client_id",nullable = false)
    private List<MaritimeLogisticModel> maritime_logistic;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name="client_id",nullable = false)
    private List<LandLogisticModel> land_logistic;

    @ManyToMany(cascade = {
        CascadeType.PERSIST,
        CascadeType.MERGE
    })
    @JoinTable(
        name = "client_storage_place",
        joinColumns = {@JoinColumn(name = "client_id")},
        inverseJoinColumns = {@JoinColumn(name = "storage_place_id")}
    )
    private Set<StoragePlaceModel> storage_places;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name="client_id",nullable = false)
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

    public Long getDocument_number() {
        return this.document_number;
    }

    public void setDocument_number(Long document_number) {
        this.document_number = document_number;
    }

    public String getFirst_name() {
        return this.first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<MaritimeLogisticModel> getMaritime_logistic() {
        return this.maritime_logistic;
    }

    public void setMaritime_logistic(List<MaritimeLogisticModel> maritime_logistic) {
        this.maritime_logistic = maritime_logistic;
    }

    public List<LandLogisticModel> getLand_logistic() {
        return this.land_logistic;
    }

    public void setLand_logistic(List<LandLogisticModel> land_logistic) {
        this.land_logistic = land_logistic;
    }

    public Set<StoragePlaceModel> getStorage_place() {
        return this.storage_places;
    }

    public void setStorage_place(Set<StoragePlaceModel> storage_places) {
        this.storage_places = storage_places;
    }


}
