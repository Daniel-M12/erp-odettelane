package com.daniel.OdetteLane.persistence.repository.tela;

import com.daniel.OdetteLane.domain.entities.fabric.Colour;
import com.daniel.OdetteLane.domain.repository.tela.ColourRepository;

import java.util.List;
import java.util.Optional;

public class ColorRepository implements ColourRepository {
    @Override
    public List<Colour> getAll() {
        return null;
    }

    @Override
    public Optional<Colour> getColourById(int colourId) {
        return Optional.empty();
    }

    @Override
    public Colour save(Colour colour) {
        return null;
    }

    @Override
    public void delete(int colourId) {

    }
}
