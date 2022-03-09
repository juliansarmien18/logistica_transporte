package com.example.ingeneo.models;
import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "client_product_logistic_type")
public class ClientProductLogisticModel implements Serializable{
    


    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;

    @JoinColumn(name = "client_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private ClientModel clientModelId;

    @JoinColumn(name = "logistic_type_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private LogisticTypeModel logisticTypeModelId;

    @JoinColumn(name = "product_type_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private ProductTypeModel productTypeModelId;

    public ClientProductLogisticModel() {
    }

    public ClientProductLogisticModel(Long id) {
        this.id = id;
    }


    public ClientProductLogisticModel(Long id, ClientModel clientModelId, LogisticTypeModel logisticTypeModelId, ProductTypeModel productTypeModelId) {
        this.id = id;
        this.clientModelId = clientModelId;
        this.logisticTypeModelId = logisticTypeModelId;
        this.productTypeModelId = productTypeModelId;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ClientModel getclientModelId() {
        return clientModelId;
    }

    public void setclientModelId(ClientModel clientModelId) {
        this.clientModelId = clientModelId;
    }

    public LogisticTypeModel getLogisticTypeModelId() {
        return logisticTypeModelId;
    }

    public void setLogisticTypeModelId(LogisticTypeModel logisticTypeModelId) {
        this.logisticTypeModelId = logisticTypeModelId;
    }

    public ProductTypeModel getProductTypeModelId() {
        return productTypeModelId;
    }

    public void setProductTypeModelId(ProductTypeModel productTypeModelId) {
        this.productTypeModelId = productTypeModelId;
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
        if (!(object instanceof ClientProductLogisticModel)) {
            return false;
        }
        ClientProductLogisticModel other = (ClientProductLogisticModel) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ingeneo.ClientProductLogisticModel[ id=" + id + " ]";
    }
    

    

}
