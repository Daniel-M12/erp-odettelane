package com.daniel.OdetteLane.persistence.crud;

import com.daniel.OdetteLane.persistence.entity.infoPrenda.Prenda;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Repository
public interface PrendaCrudRepository extends CrudRepository<Prenda,Integer> {
    //@Query(value = "SELECT * FROM Prenda WHERE Co_idPrenda = ?", nativeQuery = true)
    //List<Prenda> getByCategoriaETC...(int idPrenda);
    List<Prenda> findByIdModeloPrendaOrderByIdPrenda(int idModeloPrenda);
    Optional<List<Prenda>> findByCostoPrendaLessThan(BigDecimal costo);
}
