package com.daniel.OdetteLane.web.controller.fabric;

import com.daniel.OdetteLane.domain.entities.fabric.Colour;
import com.daniel.OdetteLane.domain.service.fabric.ColourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/colours")
public class ColourController {
    @Autowired
    private ColourService colourService;

    @GetMapping("")
    public ResponseEntity<List<Colour>> getAll(){
        return new ResponseEntity<>(colourService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Colour> getColour(@PathVariable("id") int colourId){
        return colourService.getColour(colourId)
                .map(colour -> new ResponseEntity<>(colour,HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<Colour> save(@RequestBody Colour colour){
        return (colour != null)?
                new ResponseEntity<>(colourService.save(colour), HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable("id") int colourId){
        if (colourService.delete(colourId)){
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
}
