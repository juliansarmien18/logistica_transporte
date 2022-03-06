package com.example.ingeneo.models;

import java.util.List;

import javax.persistence.*;





@Entity
@Table(name = "document_type")
public class DocumentTypeModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    
    @Column(length = 80,nullable = false)
    private String name;

    @Column(length = 4,nullable = false)
    private String abbreviation;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name="document_type",nullable = false)
    private List<ClientModel> clients;


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

    public String getAbbreviation() {
        return this.abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public List<ClientModel> getClients() {
        return this.clients;
    }

    public void setClients(List<ClientModel> clients) {
        this.clients = clients;
    }

}
