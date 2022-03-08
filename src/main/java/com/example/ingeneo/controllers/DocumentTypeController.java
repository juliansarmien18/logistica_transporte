package com.example.ingeneo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.ingeneo.models.DocumentTypeModel;
import com.example.ingeneo.services.DocumentTypeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/document-type")
public class DocumentTypeController {
    
    @Autowired
    DocumentTypeService dService;

    @GetMapping()
    public ArrayList<DocumentTypeModel> getDocumentType(){
        return dService.getdocumentType();
    }

    @PostMapping()
    public DocumentTypeModel postDocumentType(@RequestBody DocumentTypeModel documentType){
        return this.dService.savedocumentType(documentType);
    }
    
    @GetMapping(path = "/{id}")
    public Optional<DocumentTypeModel> getById(@PathVariable("id") Long id){
        return this.dService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public DocumentTypeModel putDocumentType(@PathVariable("id") Long id, @RequestBody DocumentTypeModel documentType){
        return this.dService.savedocumentType(documentType);
    }

    @DeleteMapping(path = "/{id}")
    public String DeleteById(@PathVariable Long id){
        boolean is_deleted = this.dService.deleteDocumentType(id);
        if (is_deleted){
            return "{tipo de documento borrado}";
        }
        else{
            return "{error al borrar tipo de documento}";
        }
    }
}
