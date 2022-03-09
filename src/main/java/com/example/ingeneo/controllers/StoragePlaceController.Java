package com.example.ingeneo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.ingeneo.models.StoragePlaceModel;
import com.example.ingeneo.services.StoragePlaceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/storage-place/")
public class StoragePlaceController {
    
    @Autowired
    StoragePlaceService StoragePlaceService;

    @GetMapping()
    public ArrayList<StoragePlaceModel> getStoragePlaces(){
        return StoragePlaceService.getStoragePlaces();
    }

    @PostMapping()
    public StoragePlaceModel postStoragePlace(@RequestBody StoragePlaceModel StoragePlace){
        return this.StoragePlaceService.saveStoragePlace(StoragePlace);
    }

    @GetMapping(path = "/{id}")
    public Optional<StoragePlaceModel> getById(@PathVariable("id") Long id){
        return this.StoragePlaceService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public StoragePlaceModel putStoragePlace(@PathVariable("id") Long id, @RequestBody StoragePlaceModel StoragePlace){
        return this.StoragePlaceService.saveStoragePlace(StoragePlace);
    }

    @DeleteMapping(path = "/{id}")
    public String DeleteById(@PathVariable Long id){
        boolean is_deleted = this.StoragePlaceService.deleteStoragePlace(id);
        if (is_deleted){
            return "{Storage Place borrado}";
        }
        else{
            return "{error al borrar al Storage Place}";
        }
    }
}
