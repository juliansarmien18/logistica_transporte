package com.example.ingeneo.models;

import javax.persistence.*;

import java.io.Serializable;
import java.sql.*;


@Entity
@Table(name = "maritime_logistic")
public class MaritimeLogisticModel implements Serializable{
    
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
    @Column(length = 8,name = "fleet_number",nullable = false)
    private String fleetNumber;

    @Basic(optional = false)
    @Column(length = 10,name = "guide_number",nullable = false,unique = true)
    private String guideNumber;

    @Basic(optional = false)
    @Column(name = "quantity",nullable = false)
    private float quantity;

    @Basic(optional = false)
    @Column(name = "register_date",nullable = false)
    private Timestamp registerDate;

    @Basic(optional = false)
    @Column(name = "shipping_price",nullable = false)
    private float shippingPrice;

    @Basic(optional = false)
    @Column(name = "final_price",nullable = false)
    private float finalPrice;

    @JoinColumn(name = "client_model_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private ClientModel clientModelId;

    @JoinColumn(name = "storage_place_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private StoragePlaceModel storagePlaceModelId;

    public MaritimeLogisticModel() {
    }

    public MaritimeLogisticModel(Long id) {
        this.id = id;
    }



    public MaritimeLogisticModel(Long id, Timestamp deliveryDate, String fleetNumber, String guideNumber, float quantity, Timestamp registerDate, float shippingPrice, float finalPrice, ClientModel clientModelId, StoragePlaceModel storagePlaceModelId) {
        this.id = id;
        this.deliveryDate = deliveryDate;
        this.fleetNumber = fleetNumber;
        this.guideNumber = guideNumber;
        this.quantity = quantity;
        this.registerDate = registerDate;
        this.shippingPrice = shippingPrice;
        this.finalPrice = finalPrice;
        this.clientModelId = clientModelId;
        this.storagePlaceModelId = storagePlaceModelId;
    }


    

    public float getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(float finalPrice) {
        this.finalPrice = finalPrice;
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

    public String getFleetNumber() {
        return fleetNumber;
    }

    public void setFleetNumber(String fleetNumber) {
        this.fleetNumber = fleetNumber;
    }

    public String getGuideNumber() {
        return guideNumber;
    }

    public void setGuideNumber(String guideNumber) {
        this.guideNumber = guideNumber;
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

    public ClientModel getClientModelId() {
        return clientModelId;
    }

    public void setClientModelId(ClientModel clientModelId) {
        this.clientModelId = clientModelId;
    }

    public StoragePlaceModel getStoragePlaceModelId() {
        return storagePlaceModelId;
    }

    public void setStoragePlaceModelId(StoragePlaceModel storagePlaceModelId) {
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
        if (!(object instanceof MaritimeLogisticModel)) {
            return false;
        }
        MaritimeLogisticModel other = (MaritimeLogisticModel) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ingeneo.MaritimeLogisticModel[ id=" + id + " ]";
    }


}
