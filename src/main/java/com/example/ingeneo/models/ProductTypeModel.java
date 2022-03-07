package com.example.ingeneo.models;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "product_type")
public class ProductTypeModel implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;

    @Basic(optional = false)
    @Column(length = 20,name = "name",nullable = false)
    private String name;

    /*
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productTypeModelId")
    private Collection<ClientProductLogisticModel> ClientProductLogisticModelCollection;*/

    public ProductTypeModel() {
    }

    public ProductTypeModel(Long id) {
        this.id = id;
    }

    public ProductTypeModel(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        if (!(object instanceof ProductTypeModel)) {
            return false;
        }
        ProductTypeModel other = (ProductTypeModel) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ingeneo.ProductTypeModel[ id=" + id + " ]";
    }
    

}
