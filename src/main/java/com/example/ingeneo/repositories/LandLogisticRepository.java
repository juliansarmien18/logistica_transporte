package com.example.ingeneo.repositories;
import java.util.ArrayList;

import com.example.ingeneo.models.ClientModel;
import com.example.ingeneo.models.LandLogisticModel;
import com.example.ingeneo.models.StoragePlaceModel;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface LandLogisticRepository extends CrudRepository<LandLogisticModel, Long>{
    public abstract ArrayList<LandLogisticModel> findByclientModelId(ClientModel client);

    public abstract ArrayList<LandLogisticModel> findBystoragePlaceModelId(StoragePlaceModel storagePlace);
}
