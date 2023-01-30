package com.daniel.OdetteLane.persistence.mapper.garment;

import com.daniel.OdetteLane.domain.entities.garment.GarmentType;
import com.daniel.OdetteLane.persistence.entity.infoPrenda.TipoPrenda;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface GarmentTypeMapper {
    @Mappings({
            @Mapping(target = "typeId", source = "idTipoPrenda"),
            @Mapping(target = "typeName", source = "nombreTipo"),
            @Mapping(target = "description", source = "descripcion"),
    })
    GarmentType toGarmentType(TipoPrenda tipoPrenda);
    List<GarmentType> toGarmentTypes(List<TipoPrenda> tipoPrendas);

    @InheritInverseConfiguration
    @Mapping(target = "modelos", ignore = true)
    TipoPrenda toTipoPrenda(GarmentType garmentType);
}
