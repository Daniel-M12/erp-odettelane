package com.daniel.OdetteLane.persistence.repository.prenda;

import com.daniel.OdetteLane.domain.entities.garment.Garment;
import com.daniel.OdetteLane.domain.repository.garment.GarmentRepository;
import com.daniel.OdetteLane.persistence.crud.prenda.PrendaCrudRepository;
import com.daniel.OdetteLane.persistence.entity.infoPrenda.Prenda;
import com.daniel.OdetteLane.persistence.mapper.garment.GarmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Repository
public class PrendaRepository implements GarmentRepository {
    @Autowired
    private PrendaCrudRepository prendaCrudRepository;
    @Autowired
    private GarmentMapper mapper;

    @Override
    public List<Garment> getAll(){
        List<Prenda> prendas = (List<Prenda>) prendaCrudRepository.findAll();
        return mapper.toGarments(prendas);
    }

    @Override
    public Optional<List<Garment>> getByModel(int modelId) {
        List<Prenda> prendas = prendaCrudRepository.findByIdModeloPrendaOrderByIdPrenda(modelId);
        return Optional.of(mapper.toGarments(prendas));
    }

    @Override
    public Optional<List<Garment>> getCheapGarments(BigDecimal price) {
        Optional<List<Prenda>> prendas = prendaCrudRepository.findByCostoPrendaLessThan(price);
        return prendas.map(prendasVar -> mapper.toGarments(prendasVar));
    }

    @Override
    public Optional<Garment> getGarment(int garmentId) {
        Optional<Prenda> prendaOptional = prendaCrudRepository.findById(garmentId);
        return prendaOptional.map(prenda -> mapper.toGarment(prenda));
    }

    @Override
    public Garment save(Garment garment) {
        Prenda prenda = mapper.toPrenda(garment);
        return mapper.toGarment(prendaCrudRepository.save(prenda));
    }

    @Override
    public void delete(int garmentId) {
        prendaCrudRepository.deleteById(garmentId);
    }

}
