package com.example.ingeneo.services;

import java.util.ArrayList;

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

    public DocumentTypeModel postdocumentType(DocumentTypeModel documentType){
        return dRepository.save(documentType);
    }
}
