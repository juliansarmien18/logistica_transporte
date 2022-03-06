package com.example.ingeneo.models;

import javax.persistence.*;
import java.sql.*;


@Entity
@Table(name = "land_logistic")
public class LandLogisticModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    @Column(nullable = false)
    private Float quantity;
    
    @Column(nullable = false)
    private Timestamp register_date;

    @Column(nullable = false)
    private Timestamp delivery_date;

    @Column(nullable = false)
    private Float shipping_price;

    @Column(nullable = false,length = 6)
    private String license_plate;

    @Column(unique = true,nullable = false,length = 10)
    private String guide_number;


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Float quantity) {
        this.quantity = quantity;
    }

    public Timestamp getRegister_date() {
        return this.register_date;
    }

    public void setRegister_date(Timestamp register_date) {
        this.register_date = register_date;
    }

    public Timestamp getDelivery_date() {
        return this.delivery_date;
    }

    public void setDelivery_date(Timestamp delivery_date) {
        this.delivery_date = delivery_date;
    }

    public Float getShipping_price() {
        return this.shipping_price;
    }

    public void setShipping_price(Float shipping_price) {
        this.shipping_price = shipping_price;
    }

    public String getLicense_plate() {
        return this.license_plate;
    }

    public void setLicense_plate(String license_plate) {
        this.license_plate = license_plate;
    }

    public String getGuide_number() {
        return this.guide_number;
    }

    public void setGuide_number(String guide_number) {
        this.guide_number = guide_number;
    }


}
