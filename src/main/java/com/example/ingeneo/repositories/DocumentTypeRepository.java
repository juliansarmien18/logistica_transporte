package com.example.ingeneo.repositories;

import com.example.ingeneo.models.DocumentTypeModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentTypeRepository extends CrudRepository<DocumentTypeModel, Long>{
    
}
