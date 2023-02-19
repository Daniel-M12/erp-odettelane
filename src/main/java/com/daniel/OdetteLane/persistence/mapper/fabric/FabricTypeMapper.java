package com.daniel.OdetteLane.persistence.mapper.fabric;

import com.daniel.OdetteLane.domain.entities.fabric.FabricType;
import com.daniel.OdetteLane.persistence.entity.infoTela.TipoTela;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface FabricTypeMapper {
    @Mappings({
            @Mapping(source = "idTipoTela", target = "fabricTypeId"),
            @Mapping(source = "nombreTipoTela", target = "fabricType"),
            @Mapping(source = "unidadMedidaPrecio", target = "measurementUnitPrice")
    })
    FabricType toFabricType(TipoTela tipoTela);

    List<FabricType> toFabricTypes(List<TipoTela> tipoTelas);

    @InheritInverseConfiguration
    @Mapping(target = "telas", ignore = true)
    TipoTela tipoTela(FabricType fabricType);
}
