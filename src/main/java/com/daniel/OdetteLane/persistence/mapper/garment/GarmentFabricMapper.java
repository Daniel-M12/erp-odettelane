package com.daniel.OdetteLane.persistence.mapper.garment;

import com.daniel.OdetteLane.domain.entities.garment.GarmentFabric;
import com.daniel.OdetteLane.persistence.entity.infoPrenda.TelaPrenda.TelaPrenda;
import com.daniel.OdetteLane.persistence.mapper.fabric.FabricMapper;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {GarmentMapper.class, FabricMapper.class})
public interface GarmentFabricMapper {
    @Mappings({
            @Mapping(source = "idTelaPrendaPK.idPrenda", target = "garmentId"),
            @Mapping(source = "tela", target = "fabric"),
            @Mapping(source = "metrosPorPrenda", target = "metersPerGarment")
    })
    GarmentFabric toGarmentFabric(TelaPrenda TelaPrenda);

    List<GarmentFabric> toGarmentFabric(List<TelaPrenda> telasPrenda);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "prenda", ignore = true),
            @Mapping(target = "idTelaPrendaPK.idTela", ignore = true)
    })
    TelaPrenda toTelaPrenda(GarmentFabric garmentFabric);

    //List<TelaPrenda> toTelasPrenda(List<GarmentFabric> garmentFabrics);
}
