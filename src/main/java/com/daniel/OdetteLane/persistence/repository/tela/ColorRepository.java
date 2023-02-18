package com.daniel.OdetteLane.persistence.repository.tela;

import com.daniel.OdetteLane.domain.entities.fabric.Colour;
import com.daniel.OdetteLane.domain.repository.tela.ColourRepository;
import com.daniel.OdetteLane.persistence.crud.tela.ColorCrudRepository;
import com.daniel.OdetteLane.persistence.entity.infoTela.Color;
import com.daniel.OdetteLane.persistence.mapper.fabric.ColourMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ColorRepository implements ColourRepository {
    @Autowired
    private ColorCrudRepository colorCrudRepository;
    @Autowired
    private ColourMapper mapper;

    @Override
    public List<Colour> getAll() {
        return mapper.toColours((List<Color>) colorCrudRepository.findAll());
    }

    @Override
    public Optional<Colour> getColourById(int colourId) {
        return colorCrudRepository.findById(colourId).map(color -> mapper.toColour(color));
    }

    @Override
    public Colour save(Colour colour) {
        Color color = colorCrudRepository.save(mapper.toColor(colour));
        return mapper.toColour(color);
    }

    @Override
    public void delete(int colourId) {
        colorCrudRepository.deleteById(colourId);
    }
}
