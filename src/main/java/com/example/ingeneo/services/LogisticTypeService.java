package com.example.ingeneo.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

import com.example.ingeneo.models.LogisticTypeModel;
import com.example.ingeneo.repositories.LogisticTypeRepository;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class LogisticTypeService {
    
    @Autowired
    LogisticTypeRepository lTRepository;

    public ArrayList<LogisticTypeModel> getLogisticType(){
        return (ArrayList<LogisticTypeModel>) lTRepository.findAll();
    }

    public LogisticTypeModel saveLogisticType(LogisticTypeModel LogisticType){
        return lTRepository.save(LogisticType);
    }

    public Optional<LogisticTypeModel>getById(Long id){
        return lTRepository.findById(id);
    }

    public boolean deleteLogisticType(Long id){
        try{
            lTRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
