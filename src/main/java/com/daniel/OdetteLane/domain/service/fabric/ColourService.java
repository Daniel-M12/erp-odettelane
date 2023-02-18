package com.daniel.OdetteLane.domain.service.fabric;

import com.daniel.OdetteLane.domain.entities.fabric.Colour;
import com.daniel.OdetteLane.domain.repository.tela.ColourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ColourService {
    @Autowired
    private ColourRepository colourRepository;

    public List<Colour> getAll(){
        return colourRepository.getAll();
    }
    public Optional<Colour> getColour(int colourId){
        return colourRepository.getColourById(colourId);
    }
    public Colour save(Colour colour){
        return colourRepository.save(colour);
    }
    public boolean delete(int colourId){
        if (getColour(colourId).isPresent()){
            colourRepository.delete(colourId);
            return true;
        } else {
            return false;
        }

    }
}
