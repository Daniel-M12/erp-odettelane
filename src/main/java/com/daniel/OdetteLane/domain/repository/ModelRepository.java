package com.daniel.OdetteLane.domain.repository;


import com.daniel.OdetteLane.domain.entities.Model;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ModelRepository {
    List<Model> getAll();
    Optional<Model> getModel(int modelId);
    Model save(Model model);
    void delete(int modelId);
}
