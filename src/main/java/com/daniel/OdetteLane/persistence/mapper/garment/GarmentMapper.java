package com.daniel.OdetteLane.persistence.mapper.garment;

import com.daniel.OdetteLane.domain.entities.garment.Garment;
import com.daniel.OdetteLane.persistence.entity.infoPrenda.Prenda;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ModelMapper.class, SizeMapper.class})
public interface GarmentMapper {
    @Mappings({
            @Mapping(source = "idPrenda", target = "garmentId"),
            @Mapping(source = "idModeloPrenda", target = "modelId"),
            @Mapping(source = "idTallaPrenda", target = "sizeId"),
            @Mapping(source = "costoPrenda", target = "cost"),
            @Mapping(source = "descripcionPrenda", target = "description"),
            @Mapping(source = "modelo", target = "model"),
            @Mapping(source = "talla", target = "size"),
    })
    Garment toGarment(Prenda prenda);
    List<Garment> toGarments(List<Prenda> prendas);

    @InheritInverseConfiguration
    Prenda toPrenda(Garment garment);
}
