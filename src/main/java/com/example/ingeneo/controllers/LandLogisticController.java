package com.example.ingeneo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.ingeneo.models.ClientModel;
import com.example.ingeneo.models.LandLogisticModel;
import com.example.ingeneo.models.StoragePlaceModel;
import com.example.ingeneo.services.LandLogisticService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/land-logistic/")
public class LandLogisticController {
    
    @Autowired
    LandLogisticService landLogisticService;
    
    @GetMapping()
    public ArrayList<LandLogisticModel> getLandLogisticModels(){
        return landLogisticService.getLandLogistics();
    }

    @GetMapping(path = "/{id}")
    public Optional<LandLogisticModel> getById(@PathVariable("id") Long id){
        return this.landLogisticService.getById(id);
    }

    @GetMapping("/client")
    public ArrayList<LandLogisticModel> getByClient(@RequestParam("client") ClientModel client){
        return this.landLogisticService.getByClient(client);
    }

    @GetMapping("/storageplace")
    public ArrayList<LandLogisticModel> getByStoragePalce(@RequestParam("storageplace") StoragePlaceModel storagePlace){
        return this.landLogisticService.getByStoragePlace(storagePlace);
    }

    @PostMapping()
    public LandLogisticModel postLandLogistic(@RequestBody LandLogisticModel LandLogistic){
        return this.landLogisticService.saveLandLogistic(LandLogistic);
    }

    @PutMapping(path = "/{id}")
    public LandLogisticModel putLandLogistic(@PathVariable("id") Long id, @RequestBody LandLogisticModel LandLogistic){
        return this.landLogisticService.saveLandLogistic(LandLogistic);
    }

    @DeleteMapping(path = "/{id}")
    public String DeleteById(@PathVariable Long id){
        boolean is_deleted = this.landLogisticService.deleteLandLogistic(id);
        if (is_deleted){
            return "{logistica terrestre borrada}";
        }
        else{
            return "{error al borrar logistica terrestre}";
        }
    }
}
