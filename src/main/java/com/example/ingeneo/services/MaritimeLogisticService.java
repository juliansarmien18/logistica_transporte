package com.example.ingeneo.services;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Optional;

import com.example.ingeneo.models.ClientModel;
import com.example.ingeneo.models.MaritimeLogisticModel;
import com.example.ingeneo.models.StoragePlaceModel;
import com.example.ingeneo.repositories.MaritimeLogisticRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaritimeLogisticService {
    
    @Autowired
    MaritimeLogisticRepository MaritimeLogisticRepository;


    public ArrayList<MaritimeLogisticModel> getMaritimeLogistics(){
        return (ArrayList<MaritimeLogisticModel>) MaritimeLogisticRepository.findAll();
    }

    public Optional<MaritimeLogisticModel>getById(Long id){
        return MaritimeLogisticRepository.findById(id);
    }

    public ArrayList<MaritimeLogisticModel> getByClient(ClientModel client){
        return (ArrayList<MaritimeLogisticModel>) MaritimeLogisticRepository.findByclientModelId(client);
    }

    public ArrayList<MaritimeLogisticModel> getByStoragePlace(StoragePlaceModel storagePlace){
        return (ArrayList<MaritimeLogisticModel>) MaritimeLogisticRepository.findBystoragePlaceModelId(storagePlace);
    }

    public MaritimeLogisticModel saveMaritimeLogistic(MaritimeLogisticModel MaritimeLogistic){
        Calendar calendar = Calendar.getInstance();
        Date date = new Date();
        Timestamp registerDate = new Timestamp(date.getTime());

        calendar.setTime(registerDate);
        calendar.add(Calendar.DAY_OF_YEAR,3);
        Timestamp deliveryDate = new Timestamp(calendar.getTimeInMillis());

        float finalPrice;
        if(MaritimeLogistic.getQuantity() > 10){
            finalPrice = (float)(MaritimeLogistic.getShippingPrice()-(MaritimeLogistic.getShippingPrice()*0.03));
        }else{
            finalPrice = MaritimeLogistic.getShippingPrice();
        }
        

        return MaritimeLogisticRepository.save(MaritimeLogistic = new MaritimeLogisticModel(
            MaritimeLogistic.getId(),deliveryDate,
            MaritimeLogistic.getFleetNumber(),MaritimeLogistic.getGuideNumber(),MaritimeLogistic.getQuantity(),registerDate,
            MaritimeLogistic.getShippingPrice(),finalPrice,MaritimeLogistic.getClientModelId(),
            MaritimeLogistic.getStoragePlaceModelId()));
    }

    public boolean deleteMaritimeLogistic(Long id){
        try{
            MaritimeLogisticRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }

}
