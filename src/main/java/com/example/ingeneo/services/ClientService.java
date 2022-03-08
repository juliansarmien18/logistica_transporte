package com.example.ingeneo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.ingeneo.models.ClientModel;
import com.example.ingeneo.repositories.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    
    @Autowired
    ClientRepository clientRepository;

    public ArrayList<ClientModel> getClients(){
        return (ArrayList<ClientModel>) clientRepository.findAll();
    }

    public ClientModel saveClient(ClientModel client){
        return clientRepository.save(client = new ClientModel(client.getId(), client.getDocumentNumber(),client.getEmail(),client.getFirstName(),
                                    client.getLastname(),client.getPassword(), client.getDocumentTypeModelId()));
    }

    public Optional<ClientModel>getById(Long id){
        return clientRepository.findById(id);
    }

    public boolean deleteClient(Long id){
        try{
            clientRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }


}
