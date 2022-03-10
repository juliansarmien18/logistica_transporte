package com.example.ingeneo.models;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name = "storage_place")
public class StoragePlaceModel implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;

    @Basic(optional = false)
    @Column(length = 255,name = "address",nullable = false)
    private String address;

    @Basic(optional = false)
    @Column(length = 80,name = "city",nullable = false)
    private String city;

    @Basic(optional = false)
    @Column(length = 80,name = "country",nullable = false)
    private String country;

    @Basic(optional = false)
    @Column(length = 30,name = "name",nullable = false)
    private String name;

    @JoinColumn(name = "logistic_type_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private LogisticTypeModel logisticTypeModelId;

    public StoragePlaceModel() {
    }

    public StoragePlaceModel(Long id) {
        this.id = id;
    }


    public StoragePlaceModel(Long id, String address, String city, String country, String name, LogisticTypeModel logisticTypeModelId) {
        this.id = id;
        this.address = address;
        this.city = city;
        this.country = country;
        this.name = name;
        this.logisticTypeModelId = logisticTypeModelId;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LogisticTypeModel getLogisticTypeModelId() {
        return logisticTypeModelId;
    }

    public void setLogisticTypeModelId(LogisticTypeModel LogisticTypeModelId) {
        this.logisticTypeModelId = LogisticTypeModelId;
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
        if (!(object instanceof StoragePlaceModel)) {
            return false;
        }
        StoragePlaceModel other = (StoragePlaceModel) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ingeneo.StoragePlaceModel[ id=" + id + " ]";
    }

 
    


}
