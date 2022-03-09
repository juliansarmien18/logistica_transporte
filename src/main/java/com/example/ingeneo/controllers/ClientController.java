package com.example.ingeneo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.ingeneo.models.ClientModel;
import com.example.ingeneo.services.ClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/client/")
public class ClientController {
    
    @Autowired
    ClientService clientService;

    @GetMapping()
    public ArrayList<ClientModel> getClients(){
        return clientService.getClients();
    }

    @PostMapping()
    public ClientModel postClient(@RequestBody ClientModel client){
        return this.clientService.saveClient(client);
    }

    @GetMapping(path = "/{id}")
    public Optional<ClientModel> getById(@PathVariable("id") Long id){
        return this.clientService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public ClientModel putClient(@PathVariable("id") Long id, @RequestBody ClientModel client){
        return this.clientService.saveClient(client);
    }

    @DeleteMapping(path = "/{id}")
    public String DeleteById(@PathVariable Long id){
        boolean is_deleted = this.clientService.deleteClient(id);
        if (is_deleted){
            return "{cliente borrado}";
        }
        else{
            return "{error al borrar al cliente}";
        }
    }
}
