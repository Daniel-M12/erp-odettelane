package com.daniel.OdetteLane.domain.repository;


import com.daniel.OdetteLane.domain.Model;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ModelRepository {
    List<Model> getAll();
    Optional<Model> getModel(int ModelId);
    Model save(Model model);
    void delete(int modelId);
}
