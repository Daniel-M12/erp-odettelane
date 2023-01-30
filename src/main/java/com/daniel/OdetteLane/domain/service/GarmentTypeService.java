package com.daniel.OdetteLane.domain.service;

import com.daniel.OdetteLane.domain.entities.garment.GarmentType;
import com.daniel.OdetteLane.domain.repository.garment.GarmentTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GarmentTypeService {
    @Autowired
    private GarmentTypeRepository garmentTypeRepository;

    public List<GarmentType> getAll(){
        return garmentTypeRepository.getALl();
    }
    public Optional<GarmentType> getGarmentType(int garmentTypeId){
        return garmentTypeRepository.getGarmentType(garmentTypeId);
    }
    public GarmentType save(GarmentType garmentType){
        return garmentTypeRepository.save(garmentType);
    }
    public boolean delete(int garmentTypeId){
        if (getGarmentType(garmentTypeId).isPresent()){
            garmentTypeRepository.delete(garmentTypeId);
            return true;
        } else {
            return false;
        }
    }
}
