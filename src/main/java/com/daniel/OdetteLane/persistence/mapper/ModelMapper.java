package com.daniel.OdetteLane.persistence.mapper;

import com.daniel.OdetteLane.domain.entities.Model;
import com.daniel.OdetteLane.persistence.entity.infoPrenda.Modelo;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ModelMapper {
    @Mappings({
            @Mapping(source = "modeloId", target = "modelId"),
            @Mapping(source = "nombreModelo", target = "model"),
            @Mapping(source = "descripcion", target = "description"),
    })
    Model toModel(Modelo modelo);
    List<Model> toModels(List<Modelo> modelo);
    @InheritInverseConfiguration
    @Mapping(target = "tipoPrenda", ignore = true)
    @Mapping(target = "prendas", ignore = true)
    Modelo toModelo(Model model);
}
