package com.example.ingeneo.repositories;
import com.example.ingeneo.models.LandLogisticModel;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface LandLogisticRepository extends CrudRepository<LandLogisticModel, Long>{
    
}
