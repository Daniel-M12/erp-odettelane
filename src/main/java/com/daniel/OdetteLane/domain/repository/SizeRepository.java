package com.daniel.OdetteLane.domain.repository;

import com.daniel.OdetteLane.domain.entities.Model;
import com.daniel.OdetteLane.domain.entities.Size;
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
