package com.daniel.OdetteLane.domain.repository;

import com.daniel.OdetteLane.domain.entities.GarmentType;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GarmentTypeRepository {
    List<GarmentType> getALl();
    Optional<GarmentType> getGarmentType(int typeId);
    GarmentType save(GarmentType garmentType);
    void delete(int typeId);
}
