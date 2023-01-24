package com.daniel.OdetteLane.domain.service;

import com.daniel.OdetteLane.domain.entities.Model;
import com.daniel.OdetteLane.domain.repository.ModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ModelService {
    @Autowired
    private ModelRepository modelRepository;

    public List<Model> getAll(){
        return modelRepository.getAll();
    }
    public Optional<Model> getModel(int modelId){
        return modelRepository.getModel(modelId);
    }
    public Model save(Model model){
        return modelRepository.save(model);
    }
    public boolean delete(int modelId){
        if (getModel(modelId).isPresent()){
            modelRepository.delete(modelId);
            return true;
        } else {
            return false;
        }

    }
}
