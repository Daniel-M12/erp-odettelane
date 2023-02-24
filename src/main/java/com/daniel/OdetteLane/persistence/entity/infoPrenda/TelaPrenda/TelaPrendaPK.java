package com.daniel.OdetteLane.persistence.entity.infoPrenda.TelaPrenda;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class TelaPrendaPK implements Serializable {
    @Column(name = "\"Co_idPrenda\"")
    private Integer idPrenda;
    @Column(name = "\"Co_idTela\"")
    private Integer idTela;

    public Integer getIdPrenda() {
        return idPrenda;
    }

    public void setIdPrenda(Integer idPrenda) {
        this.idPrenda = idPrenda;
    }

    public Integer getIdTela() {
        return idTela;
    }

    public void setIdTela(Integer idTela) {
        this.idTela = idTela;
    }
}
