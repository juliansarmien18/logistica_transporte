package com.example.ingeneo.models;


import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name = "document_type")
public class DocumentTypeModel implements Serializable{
    

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;

    @Basic(optional = false)
    @Column(length = 4,name = "abbreviation",nullable = false,unique = true)
    private String abbreviation;

    @Basic(optional = false)
    @Column(length = 80,name = "name",nullable = false,unique = true)
    private String name;

    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "DocumentTypeModelId")
    private Collection<ClientModel> ClientModelCollection;*/

    public DocumentTypeModel() {
    }

    public DocumentTypeModel(Long id) {
        this.id = id;
    }

    public DocumentTypeModel(Long id, String abbreviation, String name) {
        this.id = id;
        this.abbreviation = abbreviation;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
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
        if (!(object instanceof DocumentTypeModel)) {
            return false;
        }
        DocumentTypeModel other = (DocumentTypeModel) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ingeneo.DocumentTypeModel[ id=" + id + " ]";
    }

}
