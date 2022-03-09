package com.example.ingeneo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.ingeneo.models.LogisticTypeModel;
import com.example.ingeneo.services.LogisticTypeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/logistic-type")
public class LogisticTypeController {
    
    @Autowired
    LogisticTypeService lTService;

    @GetMapping()
    public ArrayList<LogisticTypeModel> getLogisticType(){
        return lTService.getLogisticType();
    }

    @PostMapping()
    public LogisticTypeModel postLogisticType(@RequestBody LogisticTypeModel LogisticType){
        return this.lTService.saveLogisticType(LogisticType);
    }
    
    @GetMapping(path = "/{id}")
    public Optional<LogisticTypeModel> getById(@PathVariable("id") Long id){
        return this.lTService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public LogisticTypeModel putLogisticType(@PathVariable("id") Long id, @RequestBody LogisticTypeModel LogisticType){
        return this.lTService.saveLogisticType(LogisticType);
    }

    @DeleteMapping(path = "/{id}")
    public String DeleteById(@PathVariable Long id){
        boolean is_deleted = this.lTService.deleteLogisticType(id);
        if (is_deleted){
            return "{tipo de logistica borrada}";
        }
        else{
            return "{error al borrar tipo de logistica}";
        }
    }
}
