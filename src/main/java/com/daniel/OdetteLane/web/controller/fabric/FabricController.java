package com.daniel.OdetteLane.web.controller.fabric;

import com.daniel.OdetteLane.domain.entities.fabric.Fabric;
import com.daniel.OdetteLane.domain.service.fabric.FabricService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/fabrics")
public class FabricController {
    @Autowired
    private FabricService fabricService;

    @GetMapping("")
    public ResponseEntity<List<Fabric>> getAll(){
        return new ResponseEntity<>(fabricService.getAll(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Fabric> getFabric(@PathVariable("id") int fabricId){
        Optional<Fabric> fabricOptional = fabricService.getFabric(fabricId);
        return fabricOptional
                .map(fabric -> new ResponseEntity<>(fabric,HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping("/save")
    public ResponseEntity<Fabric> save(@RequestBody Fabric fabric){
        return (fabric != null) ? new ResponseEntity<>(fabricService.save(fabric),HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable("id") int fabricId){
        return fabricService.delete(fabricId)?
                new ResponseEntity<>(HttpStatus.NO_CONTENT)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
