package com.example.ingeneo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.ingeneo.models.ProductTypeModel;
import com.example.ingeneo.services.ProductTypeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product-type")
public class ProductTypeController {
    
    @Autowired
    ProductTypeService pTService;

    @GetMapping()
    public ArrayList<ProductTypeModel> getProductType(){
        return pTService.getProductType();
    }

    @PostMapping()
    public ProductTypeModel postProductType(@RequestBody ProductTypeModel ProductType){
        return this.pTService.saveProductType(ProductType);
    }
    
    @GetMapping(path = "/{id}")
    public Optional<ProductTypeModel> getById(@PathVariable("id") Long id){
        return this.pTService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public ProductTypeModel putProductType(@PathVariable("id") Long id, @RequestBody ProductTypeModel ProductType){
        return this.pTService.saveProductType(ProductType);
    }

    @DeleteMapping(path = "/{id}")
    public String DeleteById(@PathVariable Long id){
        boolean is_deleted = this.pTService.deleteProductType(id);
        if (is_deleted){
            return "{tipo de producto borrada}";
        }
        else{
            return "{error al borrar tipo de producto}";
        }
    }
}
