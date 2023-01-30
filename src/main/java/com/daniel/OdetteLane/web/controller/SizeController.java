package com.daniel.OdetteLane.web.controller;

import com.daniel.OdetteLane.domain.entities.garment.Size;
import com.daniel.OdetteLane.domain.service.SizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sizes")
public class SizeController {
    @Autowired
    private SizeService sizeService;

    @GetMapping()
    public ResponseEntity<List<Size>> getAll(){
        return new ResponseEntity<>(sizeService.getAll(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Size> getSize(@PathVariable("id") int sizeId){
        return sizeService.getSize(sizeId)
                .map(size -> new ResponseEntity<>(size, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping("/save")
    public ResponseEntity<Size> save(@RequestBody Size size){
        return (size != null)?
                new ResponseEntity<>(sizeService.save(size),HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    public ResponseEntity delete(@PathVariable("id") int sizeId){
        return (sizeService.delete(sizeId))?
                new ResponseEntity<>(sizeService.delete(sizeId),HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
