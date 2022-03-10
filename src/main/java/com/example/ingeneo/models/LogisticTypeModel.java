package com.example.ingeneo.models;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "logistic_type")
public class LogisticTypeModel implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;

    @Basic(optional = false)
    @Column(length = 20,name = "name",nullable = false,unique = true)
    private String name;


    public LogisticTypeModel() {
    }

    public LogisticTypeModel(Long id) {
        this.id = id;
    }

    public LogisticTypeModel(Long id, String name) {
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
        if (!(object instanceof LogisticTypeModel)) {
            return false;
        }
        LogisticTypeModel other = (LogisticTypeModel) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ingeneo.LogisticTypeModel[ id=" + id + " ]";
    }
    
}
