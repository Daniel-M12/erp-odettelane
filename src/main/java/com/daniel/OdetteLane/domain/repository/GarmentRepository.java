package com.daniel.OdetteLane.domain.repository;

import com.daniel.OdetteLane.domain.Garment;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Repository
public interface GarmentRepository {
    List<Garment> getAll();
    Optional<List<Garment>> getByModel(int modelId);
    Optional<List<Garment>> getCheapGarments(BigDecimal price);
    Optional<Garment> getGarment(int garmentId);
    Garment save(Garment garment);
    void delete(int garmentId);
}
