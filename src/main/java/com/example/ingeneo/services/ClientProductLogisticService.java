package com.example.ingeneo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.ingeneo.models.ClientModel;
import com.example.ingeneo.models.ClientProductLogisticModel;
import com.example.ingeneo.models.LogisticTypeModel;
import com.example.ingeneo.models.ProductTypeModel;
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

    public ArrayList<ClientProductLogisticModel> getClientProductLogisticsByClient(ClientModel client){
        return (ArrayList<ClientProductLogisticModel>) clientProductLogisticRepository.findByclientModelId(client);
    }

    public ArrayList<ClientProductLogisticModel> getClientProductLogisticsByProduct(ProductTypeModel product){
        return (ArrayList<ClientProductLogisticModel>) clientProductLogisticRepository.findByproductTypeModelId(product);
    }

    public ArrayList<ClientProductLogisticModel> getClientProductLogisticsByLogistic(LogisticTypeModel logistic){
        return (ArrayList<ClientProductLogisticModel>) clientProductLogisticRepository.findBylogisticTypeModelId(logistic);
    }

    public ClientProductLogisticModel saveClientProductLogistic(ClientProductLogisticModel clientProductLogistic){
        return clientProductLogisticRepository.save(clientProductLogistic = new ClientProductLogisticModel(clientProductLogistic.getId(),clientProductLogistic.getclientModelId(),
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
