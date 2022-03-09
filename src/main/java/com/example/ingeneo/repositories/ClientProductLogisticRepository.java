package com.example.ingeneo.repositories;
import java.util.ArrayList;

import com.example.ingeneo.models.ClientModel;
import com.example.ingeneo.models.ClientProductLogisticModel;
import com.example.ingeneo.models.LogisticTypeModel;
import com.example.ingeneo.models.ProductTypeModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientProductLogisticRepository extends CrudRepository<ClientProductLogisticModel, Long>{
    public abstract ArrayList<ClientProductLogisticModel> findByclientModelId(ClientModel client);

    public abstract ArrayList<ClientProductLogisticModel> findByproductTypeModelId(ProductTypeModel product);

    public abstract ArrayList<ClientProductLogisticModel> findBylogisticTypeModelId(LogisticTypeModel logistic);

}

