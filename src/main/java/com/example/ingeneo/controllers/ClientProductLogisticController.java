package com.example.ingeneo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.ingeneo.models.ClientProductLogisticModel;
import com.example.ingeneo.services.ClientProductLogisticService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/client-product-logistic/")
public class ClientProductLogisticController {
    
    @Autowired
    ClientProductLogisticService clientProductLogisticService;

    @GetMapping()
    public ArrayList<ClientProductLogisticModel> getClientProductLogistics(){
        return clientProductLogisticService.getClientProductLogistics();
    }

    @PostMapping()
    public ClientProductLogisticModel postClientProductLogistic(@RequestBody ClientProductLogisticModel clientProductLogistic){
        return this.clientProductLogisticService.saveClientProductLogistic(clientProductLogistic);
    }

    @GetMapping(path = "/{id}")
    public Optional<ClientProductLogisticModel> getById(@PathVariable("id") Long id){
        return this.clientProductLogisticService.getById(id);
    }

    @DeleteMapping(path = "/{id}")
    public String DeleteById(@PathVariable Long id){
        boolean is_deleted = this.clientProductLogisticService.deleteById(id);
        if (is_deleted){
            return "{relacion borrada}";
        }
        else{
            return "{error al borrar relacion}";
        }
    }

}
