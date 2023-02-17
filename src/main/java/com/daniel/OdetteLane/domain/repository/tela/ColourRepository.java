package com.daniel.OdetteLane.domain.repository.tela;

import com.daniel.OdetteLane.domain.entities.fabric.Colour;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ColourRepository {
    List<Colour> getAll();
    Optional<Colour> getColourById(int colourId);
    Colour save(Colour colour);
    void delete(int colourId);
}
