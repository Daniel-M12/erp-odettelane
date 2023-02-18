package com.daniel.OdetteLane.persistence.mapper.fabric;

import com.daniel.OdetteLane.domain.entities.fabric.Fabric;
import com.daniel.OdetteLane.persistence.entity.infoTela.Tela;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ColourMapper.class})
public interface FabricMapper {
    @Mappings({
            @Mapping(source = "idTela", target = "fabricId"),
            @Mapping(source = "tela", target = "fabricName"),
            @Mapping(source = "descripcion", target = "description"),
            @Mapping(source = "idTipoTela", target = "fabricType"),
            @Mapping(source = "idMaterial", target = "materialId"),
            @Mapping(source = "idColor", target = "colorId"),
            @Mapping(source = "color", target = "colour")
    })
    Fabric toFabric(Tela tela);
    List<Fabric> toFabrics(List<Tela> telas);

    @InheritInverseConfiguration
    Tela toTela(Fabric fabric);
    //List<Tela> toTelas(List<Fabric> fabrics);
}
