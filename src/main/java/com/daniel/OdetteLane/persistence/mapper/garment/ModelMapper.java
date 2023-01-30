package com.daniel.OdetteLane.persistence.mapper.garment;

import com.daniel.OdetteLane.domain.entities.garment.Model;
import com.daniel.OdetteLane.persistence.entity.infoPrenda.Modelo;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {GarmentTypeMapper.class})
public interface ModelMapper {
    @Mappings({
            @Mapping(source = "idModelo", target = "modelId"),
            @Mapping(source = "nombreModelo", target = "model"),
            @Mapping(source = "descripcion", target = "description"),
            @Mapping(target = "garmentTypeId", source = "idTipoPrenda"),
            @Mapping(source = "tipoPrenda", target = "garmentType"),
    })
    Model toModel(Modelo modelo);
    List<Model> toModels(List<Modelo> modelo);
    @InheritInverseConfiguration
    @Mapping(target = "prendas", ignore = true)
    Modelo toModelo(Model model);
}
