package com.daniel.OdetteLane.web.controller;

import com.daniel.OdetteLane.domain.entities.garment.GarmentType;
import com.daniel.OdetteLane.domain.service.GarmentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/garmentypes")
public class GarmentTypeController {
    @Autowired
    private GarmentTypeService garmentTypeService;

    @GetMapping()
    public ResponseEntity<List<GarmentType>> getAll(){
        return new ResponseEntity<>(garmentTypeService.getAll(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<GarmentType> getGarmentType(@PathVariable("id") int garmentTypeId){
        return garmentTypeService.getGarmentType(garmentTypeId)
                .map(model -> new ResponseEntity<>(model, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping("/save")
    public ResponseEntity<GarmentType> save(@RequestBody GarmentType garmentType){
        return (garmentType != null)?
                new ResponseEntity<>(garmentTypeService.save(garmentType), HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @DeleteMapping("delete/{id}")
    public ResponseEntity delete(@PathVariable("id") int garmentTypeId){
        return (garmentTypeService.delete(garmentTypeId))?
                new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
