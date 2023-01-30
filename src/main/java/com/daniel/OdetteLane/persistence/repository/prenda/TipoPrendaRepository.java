package com.daniel.OdetteLane.persistence.repository.prenda;

import com.daniel.OdetteLane.domain.entities.garment.GarmentType;
import com.daniel.OdetteLane.domain.repository.garment.GarmentTypeRepository;
import com.daniel.OdetteLane.persistence.crud.prenda.TipoPrendaCrudRepository;
import com.daniel.OdetteLane.persistence.entity.infoPrenda.TipoPrenda;
import com.daniel.OdetteLane.persistence.mapper.garment.GarmentTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TipoPrendaRepository implements GarmentTypeRepository {
    @Autowired
    private TipoPrendaCrudRepository tipoPrendaCrudRepository;
    @Autowired
    private GarmentTypeMapper mapper;
    @Override
    public List<GarmentType> getALl() {
        List<TipoPrenda> tipoPrendas = (List<TipoPrenda>) tipoPrendaCrudRepository.findAll();
        return mapper.toGarmentTypes(tipoPrendas);
    }

    @Override
    public Optional<GarmentType> getGarmentType(int typeId) {
        return tipoPrendaCrudRepository.findById(typeId).map(tipoPrenda -> mapper.toGarmentType(tipoPrenda));
    }

    @Override
    public GarmentType save(GarmentType garmentType) {
        TipoPrenda tipoPrenda = tipoPrendaCrudRepository.save(mapper.toTipoPrenda(garmentType));
        return mapper.toGarmentType(tipoPrenda);
    }

    @Override
    public void delete(int typeId) {
        tipoPrendaCrudRepository.deleteById(typeId);
    }
}
