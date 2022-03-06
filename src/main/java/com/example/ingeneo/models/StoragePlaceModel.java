package com.example.ingeneo.models;

import java.util.List;

import javax.persistence.*;


@Entity
@Table(name = "storage_place")
public class StoragePlaceModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    @Column(length = 30,nullable = false)
    private String name;

    @Column(length = 80,nullable = false)
    private String country;

    @Column(length = 80,nullable = false)
    private String city;

    @Column(length = 255,nullable = false)
    private String address;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name="storage_place_id",nullable = false)
    private List<LandLogisticModel> land_logistic;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name="storage_place_id",nullable = false)
    private List<MaritimeLogisticModel> maritime_losgistic;


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

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<LandLogisticModel> getLand_logistic() {
        return this.land_logistic;
    }

    public void setLand_logistic(List<LandLogisticModel> land_logistic) {
        this.land_logistic = land_logistic;
    }

    public List<MaritimeLogisticModel> getMaritime_losgistic() {
        return this.maritime_losgistic;
    }

    public void setMaritime_losgistic(List<MaritimeLogisticModel> maritime_losgistic) {
        this.maritime_losgistic = maritime_losgistic;
    }

}
