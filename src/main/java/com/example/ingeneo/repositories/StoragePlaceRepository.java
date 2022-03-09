package com.example.ingeneo.repositories;
import com.example.ingeneo.models.StoragePlaceModel;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface StoragePlaceRepository extends CrudRepository<StoragePlaceModel, Long>{
    
}
