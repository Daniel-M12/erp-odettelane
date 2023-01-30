package com.daniel.OdetteLane.domain.service;

import com.daniel.OdetteLane.domain.entities.garment.Garment;
import com.daniel.OdetteLane.domain.repository.garment.GarmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GarmentService {
    @Autowired
    private GarmentRepository garmentRepository;

    public List<Garment> getAll(){
        return garmentRepository.getAll();
    }

    public Optional<Garment> getGarment(int garmentId){
        return garmentRepository.getGarment(garmentId);
    }

    public Optional<List<Garment>> getByModel(int modelId){
        return garmentRepository.getByModel(modelId);
    }

    public Garment save(Garment garment){
        return garmentRepository.save(garment);
    }

    public boolean delete(int garmentId){
        if (getGarment(garmentId).isPresent()){
            garmentRepository.delete(garmentId);
            return true;
        } else {
            return false;
        }
        /*return getGarment(garmentId).map(garment -> {
            garmentRepository.delete(garmentId);
            return true;
        }).orElse(false);*/
    }
}
