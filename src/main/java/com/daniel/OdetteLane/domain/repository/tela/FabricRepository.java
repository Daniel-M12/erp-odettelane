package com.daniel.OdetteLane.domain.repository.tela;

import com.daniel.OdetteLane.domain.entities.fabric.Fabric;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FabricRepository {
    List<Fabric> getAll();
    Optional<Fabric> getFabric(int fabricId);
    Fabric save(Fabric fabric);
    void delete(int fabricId);
}
