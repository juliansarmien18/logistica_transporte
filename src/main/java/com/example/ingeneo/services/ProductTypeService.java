package com.example.ingeneo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.ingeneo.models.ProductTypeModel;
import com.example.ingeneo.repositories.ProductTypeRepository;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ProductTypeService {
    @Autowired
    ProductTypeRepository lTRepository;

    public ArrayList<ProductTypeModel> getProductType(){
        return (ArrayList<ProductTypeModel>) lTRepository.findAll();
    }

    public ProductTypeModel saveProductType(ProductTypeModel ProductType){
        return lTRepository.save(ProductType);
    }

    public Optional<ProductTypeModel>getById(Long id){
        return lTRepository.findById(id);
    }

    public boolean deleteProductType(Long id){
        try{
            lTRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
