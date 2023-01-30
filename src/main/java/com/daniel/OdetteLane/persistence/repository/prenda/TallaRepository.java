package com.daniel.OdetteLane.persistence.repository.prenda;

import com.daniel.OdetteLane.domain.entities.garment.Size;
import com.daniel.OdetteLane.domain.repository.garment.SizeRepository;
import com.daniel.OdetteLane.persistence.crud.prenda.TallaCrudRepository;
import com.daniel.OdetteLane.persistence.entity.infoPrenda.Talla;
import com.daniel.OdetteLane.persistence.mapper.garment.SizeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TallaRepository implements SizeRepository {
    @Autowired
    private TallaCrudRepository tallaCrudRepository;
    @Autowired
    private SizeMapper mapper;
    @Override
    public List<Size> getAll() {
        List<Talla> tallas = (List<Talla>) tallaCrudRepository.findAll();
        return mapper.toSizes(tallas);
    }

    @Override
    public Optional<Size> getSize(int sizeId) {
        Optional<Talla> tallaOptional = tallaCrudRepository.findById(sizeId);
        return tallaOptional.map(talla -> mapper.toSize(talla));
    }

    @Override
    public Size save(Size size) {
        Talla talla = mapper.toTalla(size);
        return mapper.toSize(tallaCrudRepository.save(talla));
    }

    @Override
    public void delete(int sizeId) {
        tallaCrudRepository.deleteById(sizeId);
    }
}
