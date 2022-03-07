package com.example.ingeneo.repositories;

import com.example.ingeneo.models.ClientModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<ClientModel, Long>{
    

}
