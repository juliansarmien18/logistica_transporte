package com.example.ingeneo.models;

import javax.persistence.*;

import java.io.Serializable;
import java.sql.*;


@Entity
@Table(name = "land_logistic")
public class LandLogisticModel implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;

    @Basic(optional = false)
    @Column(name = "delivery_date",nullable = false)
    private Timestamp deliveryDate;

    @Basic(optional = false)
    @Column(length = 10,name = "guide_number",nullable = false)
    private String guideNumber;

    @Basic(optional = false)
    @Column(length = 6,name = "license_plate",nullable = false)
    private String licensePlate;

    @Basic(optional = false)
    @Column(name = "quantity",nullable = false)
    private float quantity;

    @Basic(optional = false)
    @Column(name = "register_date",nullable = false)
    private Timestamp registerDate;

    @Basic(optional = false)
    @Column(name = "shipping_price",nullable = false)
    private float shippingPrice;

    @JoinColumn(name = "client_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private ClientModel ClientModelId;

    @JoinColumn(name = "storage_place_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private StoragePlaceModel storagePlaceModelId;

    public LandLogisticModel() {
    }

    public LandLogisticModel(Long id) {
        this.id = id;
    }


    public LandLogisticModel(Long id, Timestamp deliveryDate, String guideNumber, String licensePlate, float quantity, Timestamp registerDate, float shippingPrice, ClientModel ClientModelId, StoragePlaceModel storagePlaceModelId) {
        this.id = id;
        this.deliveryDate = deliveryDate;
        this.guideNumber = guideNumber;
        this.licensePlate = licensePlate;
        this.quantity = quantity;
        this.registerDate = registerDate;
        this.shippingPrice = shippingPrice;
        this.ClientModelId = ClientModelId;
        this.storagePlaceModelId = storagePlaceModelId;
    }
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Timestamp deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getGuideNumber() {
        return guideNumber;
    }

    public void setGuideNumber(String guideNumber) {
        this.guideNumber = guideNumber;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public Timestamp getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Timestamp registerDate) {
        this.registerDate = registerDate;
    }

    public float getShippingPrice() {
        return shippingPrice;
    }

    public void setShippingPrice(float shippingPrice) {
        this.shippingPrice = shippingPrice;
    }

    public ClientModel getclientModelId() {
        return ClientModelId;
    }

    public void setclientModelId(ClientModel ClientModelId) {
        this.ClientModelId = ClientModelId;
    }

    public StoragePlaceModel getstoragePlaceModelId() {
        return storagePlaceModelId;
    }

    public void setstoragePlaceModelId(StoragePlaceModel storagePlaceModelId) {
        this.storagePlaceModelId = storagePlaceModelId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LandLogisticModel)) {
            return false;
        }
        LandLogisticModel other = (LandLogisticModel) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ingeneo.LandLogisticModel[ id=" + id + " ]";
    }


}
