package com.example.ingeneo.repositories;

import java.util.ArrayList;

import com.example.ingeneo.models.ClientModel;
import com.example.ingeneo.models.DocumentTypeModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<ClientModel, Long>{

    public abstract ArrayList<ClientModel> findByDocumentTypeModelId(DocumentTypeModel documentType);
}
