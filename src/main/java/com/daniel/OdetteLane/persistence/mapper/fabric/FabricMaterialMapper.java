package com.daniel.OdetteLane.persistence.mapper.fabric;

import com.daniel.OdetteLane.domain.entities.fabric.FabricMaterial;
import com.daniel.OdetteLane.persistence.entity.infoTela.MaterialTela;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface FabricMaterialMapper {
    @Mappings({
            @Mapping(source = "idMaterialTela", target = "fabricMaterialId"),
            @Mapping(source = "nombreMaterial", target = "fabricMaterial"),
            @Mapping(source = "composicion", target = "composition"),
            @Mapping(source = "descripcion", target = "description")
    })
    FabricMaterial toFabricMaterial(MaterialTela materialTela);
    List<FabricMaterial> toFabricMaterials(List<MaterialTela> materialTelas);

    @InheritInverseConfiguration
    @Mapping(target = "telas", ignore = true)
    MaterialTela toMaterialTela(FabricMaterial fabricMaterial);
}
