package com.example.ingeneo.repositories;
import java.util.ArrayList;

import com.example.ingeneo.models.ClientModel;
import com.example.ingeneo.models.MaritimeLogisticModel;
import com.example.ingeneo.models.StoragePlaceModel;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface MaritimeLogisticRepository extends CrudRepository<MaritimeLogisticModel, Long>{
    public abstract ArrayList<MaritimeLogisticModel> findByclientModelId(ClientModel client);

    public abstract ArrayList<MaritimeLogisticModel> findBystoragePlaceModelId(StoragePlaceModel storagePlace);
}
