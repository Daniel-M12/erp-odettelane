package com.daniel.OdetteLane.persistence.mapper.garment;

import com.daniel.OdetteLane.domain.entities.garment.Size;
import com.daniel.OdetteLane.persistence.entity.infoPrenda.Talla;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SizeMapper {
    @Mappings({
            @Mapping(source = "idTalla",target = "sizeId"),
            @Mapping(source = "valor",target = "value"),
            @Mapping(source = "categoria",target = "category"),
    })
    Size toSize(Talla talla);
    List<Size> toSizes(List<Talla> tallas);
    @InheritInverseConfiguration
    @Mapping(target = "prendas", ignore = true)
    Talla toTalla(Size size);
}
