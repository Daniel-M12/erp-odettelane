package com.daniel.OdetteLane.persistence.repository;

import com.daniel.OdetteLane.domain.entities.Model;
import com.daniel.OdetteLane.domain.repository.ModelRepository;
import com.daniel.OdetteLane.persistence.crud.ModeloCrudRepository;
import com.daniel.OdetteLane.persistence.entity.infoPrenda.Modelo;
import com.daniel.OdetteLane.persistence.mapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ModeloRepository implements ModelRepository {
    @Autowired
    private ModeloCrudRepository modeloCrudRepository;
    @Autowired
    private ModelMapper mapper;
    @Override
    public List<Model> getAll() {
        List<Modelo> modelos = (List<Modelo>) modeloCrudRepository.findAll();
        return mapper.toModels(modelos);
    }

    @Override
    public Optional<Model> getModel(int modelId) {
        Optional<Modelo> modeloOptional = modeloCrudRepository.findById(modelId);
        return modeloOptional.map(modelo -> mapper.toModel(modelo));
    }

    @Override
    public Model save(Model model) {
        Modelo modelo = mapper.toModelo(model);
        return mapper.toModel(modeloCrudRepository.save(modelo));
    }

    @Override
    public void delete(int modelId) {
        modeloCrudRepository.deleteById(modelId);
    }
}
