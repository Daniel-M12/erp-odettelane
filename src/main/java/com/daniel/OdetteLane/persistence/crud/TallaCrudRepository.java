package com.daniel.OdetteLane.persistence.crud;

import com.daniel.OdetteLane.persistence.entity.infoPrenda.Talla;
import org.springframework.data.repository.CrudRepository;

public interface TallaCrudRepository extends CrudRepository<Talla,Integer> {
}
