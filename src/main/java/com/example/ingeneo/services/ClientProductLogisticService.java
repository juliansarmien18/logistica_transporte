package com.example.ingeneo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.ingeneo.models.ClientProductLogisticModel;
import com.example.ingeneo.repositories.ClientProductLogisticRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientProductLogisticService {
    
    @Autowired
    ClientProductLogisticRepository clientProductLogisticRepository;

    public ArrayList<ClientProductLogisticModel> getClientProductLogistics(){
        return (ArrayList<ClientProductLogisticModel>) clientProductLogisticRepository.findAll();
    }

    public ClientProductLogisticModel saveClientProductLogistic(ClientProductLogisticModel clientProductLogistic){
        return clientProductLogisticRepository.save(clientProductLogistic = new ClientProductLogisticModel(clientProductLogistic.getId(),clientProductLogistic.getClientModelId(),
                                                                                                        clientProductLogistic.getLogisticTypeModelId(),clientProductLogistic.getProductTypeModelId()));
    }

    public Optional<ClientProductLogisticModel>getById(Long id){
        return clientProductLogisticRepository.findById(id);
    }

    public boolean deleteById(Long id){
        try{
            clientProductLogisticRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
