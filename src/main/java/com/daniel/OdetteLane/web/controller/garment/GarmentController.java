package com.daniel.OdetteLane.web.controller.garment;

import com.daniel.OdetteLane.domain.entities.garment.Garment;
import com.daniel.OdetteLane.domain.service.garment.GarmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/garments")
public class GarmentController {
    @Autowired
    private GarmentService garmentService;

    @GetMapping("")
    public ResponseEntity<List<Garment>> getAll(){
        return new ResponseEntity<>(garmentService.getAll(),HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Garment> getGarment(@PathVariable("id") int garmentId){
        return garmentService.getGarment(garmentId)
                .map(garment -> new ResponseEntity<>(garment,HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

   @GetMapping("/model/{id}")
    public ResponseEntity<List<Garment>> getByModel(@PathVariable("id") int modelID){
        return garmentService.getByModel(modelID)
                .map(garments -> new ResponseEntity<>(garments,HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<Garment> save(@RequestBody Garment garment){
        return (garment != null) ?
                (new ResponseEntity<>(garmentService.save(garment),HttpStatus.OK))
                : (new ResponseEntity<>(HttpStatus.NO_CONTENT));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable("id") int garmentId){
        if(garmentService.delete(garmentId)){
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
}
