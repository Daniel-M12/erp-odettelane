package com.daniel.OdetteLane.persistence.mapper.fabric;

import com.daniel.OdetteLane.domain.entities.fabric.Colour;
import com.daniel.OdetteLane.persistence.entity.infoTela.Color;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ColourMapper {
    @Mappings({
            @Mapping(source = "idColor", target = "colourId"),
            @Mapping(source = "nombre", target = "colour")
    })
    public Colour toColour(Color color);
    List<Colour> toColours(List<Color> colores);
    @InheritInverseConfiguration
    public Color toColor(Colour colour);
}
