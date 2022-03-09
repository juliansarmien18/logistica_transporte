package com.example.ingeneo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.ingeneo.models.MaritimeLogisticModel;
import com.example.ingeneo.services.MaritimeLogisticService;

@RestController
@RequestMapping("/api/maritime-logistic/")
public class MaritimeLogisticController {
    
    @Autowired
    MaritimeLogisticService MaritimeLogisticService;
    
    @GetMapping()
    public ArrayList<MaritimeLogisticModel> getMaritimeLogisticModels(){
        return MaritimeLogisticService.getMaritimeLogistics();
    }

    @PostMapping()
    public MaritimeLogisticModel postMaritimeLogistic(@RequestBody MaritimeLogisticModel MaritimeLogistic){
        return this.MaritimeLogisticService.saveMaritimeLogistic(MaritimeLogistic);
    }

    @GetMapping(path = "/{id}")
    public Optional<MaritimeLogisticModel> getById(@PathVariable("id") Long id){
        return this.MaritimeLogisticService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public MaritimeLogisticModel putMaritimeLogistic(@PathVariable("id") Long id, @RequestBody MaritimeLogisticModel MaritimeLogistic){
        return this.MaritimeLogisticService.saveMaritimeLogistic(MaritimeLogistic);
    }

    @DeleteMapping(path = "/{id}")
    public String DeleteById(@PathVariable Long id){
        boolean is_deleted = this.MaritimeLogisticService.deleteMaritimeLogistic(id);
        if (is_deleted){
            return "{logistica Maritima borrada}";
        }
        else{
            return "{error al borrar logistica Maritima}";
        }
    }
}
