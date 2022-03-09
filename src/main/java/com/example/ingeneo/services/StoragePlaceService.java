package com.example.ingeneo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.ingeneo.models.StoragePlaceModel;
import com.example.ingeneo.repositories.StoragePlaceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoragePlaceService {

    @Autowired
    StoragePlaceRepository StoragePlaceRepository;

    public ArrayList<StoragePlaceModel> getStoragePlaces(){
        return (ArrayList<StoragePlaceModel>) StoragePlaceRepository.findAll();
    }

    public StoragePlaceModel saveStoragePlace(StoragePlaceModel StoragePlace){
        return StoragePlaceRepository.save(StoragePlace = new StoragePlaceModel(StoragePlace.getId(),
                                            StoragePlace.getAddress(),StoragePlace.getCity(),StoragePlace.getCountry(),
                                            StoragePlace.getName(),StoragePlace.getLogisticTypeModelId()));
    }

    public Optional<StoragePlaceModel>getById(Long id){
        return StoragePlaceRepository.findById(id);
    }

    public boolean deleteStoragePlace(Long id){
        try{
            StoragePlaceRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
