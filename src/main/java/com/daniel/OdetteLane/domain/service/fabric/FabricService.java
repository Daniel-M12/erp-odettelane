package com.daniel.OdetteLane.domain.service.fabric;

import com.daniel.OdetteLane.domain.entities.fabric.Fabric;
import com.daniel.OdetteLane.domain.repository.tela.FabricRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FabricService {
    @Autowired
    private FabricRepository fabricRepository;

    public List<Fabric> getAll(){
        return fabricRepository.getAll();
    }
    public Optional<Fabric> getFabric(int fabricId){
        return fabricRepository.getFabric(fabricId);
    }
    public Fabric save (Fabric fabric){
        return fabricRepository.save(fabric);
    }
    public boolean delete(int fabricId){
        return getFabric(fabricId).map(fabric -> {
            fabricRepository.delete(fabricId);
            return true;
        }).orElse(false);
        /*if (getFabric(fabricId).isPresent()){
            fabricRepository.delete(fabricId);
            return true;
        } else {
            return false;
        }*/
    }
}
