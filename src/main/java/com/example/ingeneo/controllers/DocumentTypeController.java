package com.example.ingeneo.controllers;

import java.util.ArrayList;

import com.example.ingeneo.models.DocumentTypeModel;
import com.example.ingeneo.services.DocumentTypeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/document-type")
public class DocumentTypeController {
    
    @Autowired
    DocumentTypeService clientService;

    @GetMapping()
    public ArrayList<DocumentTypeModel> getDocumentType(){
        return clientService.getdocumentType();
    }

    @PostMapping()
    public DocumentTypeModel postDocumentType(@RequestBody DocumentTypeModel documentType){
        return this.clientService.postdocumentType(documentType);
    }
}
