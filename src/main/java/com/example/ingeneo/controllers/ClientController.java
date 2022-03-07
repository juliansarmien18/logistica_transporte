package com.example.ingeneo.controllers;

import java.util.ArrayList;

import com.example.ingeneo.models.ClientModel;
import com.example.ingeneo.services.ClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/client")
public class ClientController {
    
    @Autowired
    ClientService clientService;

    @GetMapping()
    public ArrayList<ClientModel> getClients(){
        return clientService.getClients();
    }

    @PostMapping()
    public ClientModel postClient(@RequestBody ClientModel client){
        return this.clientService.postClient(client);
    }
}
