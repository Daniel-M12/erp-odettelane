package com.daniel.OdetteLane.web.controller;

import com.daniel.OdetteLane.domain.entities.garment.Model;
import com.daniel.OdetteLane.domain.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/models")
public class ModelController {
    @Autowired
    private ModelService modelService;

    @GetMapping()
    public ResponseEntity<List<Model>> getAll(){
        return new ResponseEntity<>(modelService.getAll(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Model> getModel(@PathVariable("id") int modelId){
        return modelService.getModel(modelId)
                .map(model -> new ResponseEntity<>(model, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping("/save")
    public ResponseEntity<Model> save(@RequestBody Model model){
        return (model != null)?
                new ResponseEntity<>(modelService.save(model), HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @DeleteMapping("delete/{id}")
    public ResponseEntity delete(@PathVariable("id") int modelId){
        return (modelService.delete(modelId))?
                new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
