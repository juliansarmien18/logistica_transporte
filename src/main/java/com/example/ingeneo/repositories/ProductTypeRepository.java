package com.example.ingeneo.repositories;
import com.example.ingeneo.models.ProductTypeModel;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface ProductTypeRepository extends CrudRepository<ProductTypeModel, Long>{
    
}
