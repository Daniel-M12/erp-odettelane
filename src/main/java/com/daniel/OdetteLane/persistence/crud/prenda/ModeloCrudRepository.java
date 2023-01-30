package com.daniel.OdetteLane.persistence.crud.prenda;

import com.daniel.OdetteLane.persistence.entity.infoPrenda.Modelo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface ModeloCrudRepository extends CrudRepository<Modelo,Integer> {
}
