package com.example.ingeneo.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.ingeneo.models.DocumentTypeModel;
import com.example.ingeneo.repositories.DocumentTypeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DocumentTypeService {
    @Autowired
    DocumentTypeRepository dRepository;

    public ArrayList<DocumentTypeModel> getdocumentType(){
        return (ArrayList<DocumentTypeModel>) dRepository.findAll();
    }

    public DocumentTypeModel savedocumentType(DocumentTypeModel documentType){
        return dRepository.save(documentType);
    }

    public Optional<DocumentTypeModel>getById(Long id){
        return dRepository.findById(id);
    }

    public boolean deleteDocumentType(Long id){
        try{
            dRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
