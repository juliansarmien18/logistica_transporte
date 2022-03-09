package com.example.ingeneo.services;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Optional;

import com.example.ingeneo.models.LandLogisticModel;
import com.example.ingeneo.repositories.LandLogisticRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LandLogisticService {

    @Autowired
    LandLogisticRepository landLogisticRepository;


    public ArrayList<LandLogisticModel> getLandLogistics(){
        return (ArrayList<LandLogisticModel>) landLogisticRepository.findAll();
    }

    public LandLogisticModel saveLandLogistic(LandLogisticModel LandLogistic){
        Calendar calendar = Calendar.getInstance();
        Date date = new Date();
        Timestamp registerDate = new Timestamp(date.getTime());

        calendar.setTime(registerDate);
        calendar.add(Calendar.DAY_OF_YEAR,3);
        Timestamp deliveryDate = new Timestamp(calendar.getTimeInMillis());

        float finalPrice;
        if(LandLogistic.getQuantity() > 10){
            finalPrice = (float)(LandLogistic.getShippingPrice()-(LandLogistic.getShippingPrice()*0.05));
        }else{
            finalPrice = LandLogistic.getShippingPrice();
        }
        

        return landLogisticRepository.save(LandLogistic = new LandLogisticModel(
            LandLogistic.getId(),deliveryDate,LandLogistic.getGuideNumber(),
            LandLogistic.getLicensePlate(),LandLogistic.getQuantity(),registerDate,
            LandLogistic.getShippingPrice(),finalPrice,LandLogistic.getClientModelId(),
            LandLogistic.getStoragePlaceModelId()));
    }

    public Optional<LandLogisticModel>getById(Long id){
        return landLogisticRepository.findById(id);
    }

    public boolean deleteLandLogistic(Long id){
        try{
            landLogisticRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
