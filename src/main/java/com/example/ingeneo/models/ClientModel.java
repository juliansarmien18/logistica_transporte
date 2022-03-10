package com.example.ingeneo.models;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "client")
public class ClientModel implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;

    @Basic(optional = false)
    @Column(name = "document_number",nullable = false,unique = true)
    private long documentNumber;
    
    @Basic(optional = false)
    @Column(length = 60, name = "email",nullable = false,unique = true)
    private String email;

    @Basic(optional = false)
    @Column(length = 20,name = "first_name",nullable = false)
    private String firstName;

    @Basic(optional = false)
    @Column(length = 20,name = "lastname",nullable = false)
    private String lastname;

    @Basic(optional = false)
    @Column(length = 15,name = "password",nullable = false)
    private String password;
    
    @JoinColumn(name = "document_type_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private DocumentTypeModel documentTypeModelId;

    public ClientModel() {
    }

    public ClientModel(Long id) {
        this.id = id;
    }


    public ClientModel(Long id, long documentNumber, String email, String firstName, String lastname, String password,DocumentTypeModel documentTypeModelId) {
        this.id = id;
        this.documentNumber = documentNumber;
        this.email = email;
        this.firstName = firstName;
        this.lastname = lastname;
        this.password = password;
        this.documentTypeModelId = documentTypeModelId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(long documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public DocumentTypeModel getDocumentTypeModelId() {
        return documentTypeModelId;
    }

    public void setDocumentTypeModelId(DocumentTypeModel DocumentTypeModelId) {
        this.documentTypeModelId = DocumentTypeModelId;
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
        if (!(object instanceof ClientModel)) {
            return false;
        }
        ClientModel other = (ClientModel) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.ingeneo.ClientModel[ id=" + id + " ]";
    }
    

}
