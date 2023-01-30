package com.daniel.OdetteLane.domain.repository.garment;

import com.daniel.OdetteLane.domain.entities.garment.Size;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SizeRepository {
    List<Size> getAll();
    Optional<Size> getSize(int sizeId);
    Size save(Size size);
    void delete(int sizeId);
}
