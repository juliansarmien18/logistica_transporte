package com.example.ingeneo.repositories;
import com.example.ingeneo.models.MaritimeLogisticModel;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface MaritimeLogisticRepository extends CrudRepository<MaritimeLogisticModel, Long>{
    
}
