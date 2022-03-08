package com.example.ingeneo.repositories;
import com.example.ingeneo.models.LogisticTypeModel;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface LogisticTypeRepository extends CrudRepository<LogisticTypeModel, Long>{
    
}
