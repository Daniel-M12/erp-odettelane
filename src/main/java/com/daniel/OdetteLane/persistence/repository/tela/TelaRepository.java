package com.daniel.OdetteLane.persistence.repository.tela;

import com.daniel.OdetteLane.domain.entities.fabric.Fabric;
import com.daniel.OdetteLane.domain.repository.tela.FabricRepository;
import com.daniel.OdetteLane.persistence.crud.tela.TelaCrudRepository;
import com.daniel.OdetteLane.persistence.entity.infoTela.Tela;
import com.daniel.OdetteLane.persistence.mapper.fabric.FabricMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TelaRepository implements FabricRepository {
    @Autowired
    private TelaCrudRepository telaCrudRepository;
    @Autowired
    private FabricMapper mapper;

    @Override
    public List<Fabric> getAll() {
        return mapper.toFabrics((List<Tela>) telaCrudRepository.findAll());
    }

    @Override
    public Optional<Fabric> getFabric(int fabricId) {
        Optional<Tela> telaOptional = telaCrudRepository.findById(fabricId);
        return telaOptional.map(tela -> mapper.toFabric(tela));
    }
    @Override
    public Fabric save(Fabric fabric) {
        Tela tela = telaCrudRepository.save(mapper.toTela(fabric));
        return mapper.toFabric(tela);
    }

    @Override
    public void delete(int fabricId) {
        telaCrudRepository.deleteById(fabricId);
    }
}
