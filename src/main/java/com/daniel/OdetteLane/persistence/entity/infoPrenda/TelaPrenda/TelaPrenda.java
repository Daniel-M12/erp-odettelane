package com.daniel.OdetteLane.persistence.entity.infoPrenda.TelaPrenda;

import com.daniel.OdetteLane.persistence.entity.infoPrenda.Prenda;
import com.daniel.OdetteLane.persistence.entity.infoTela.Tela;
import jakarta.persistence.*;


@Entity
@Table(name = "\"Tela_Prenda\"")
public class TelaPrenda {
    @EmbeddedId
    private TelaPrendaPK idTelaPrendaPK;
    @Column(name = "\"Nu_MetrosPorPrenda\"")
    private Double metrosPorPrenda;

    @ManyToOne
    @JoinColumn(name = "\"Co_idTela\"", insertable = false, updatable = false)
    private Tela tela;

    @ManyToOne
    @MapsId("idPrenda")
    @JoinColumn(name = "\"Co_idPrenda\"", insertable = false, updatable = false)
    private Prenda prenda;


    public TelaPrendaPK getIdTelaPrendaPK() {
        return idTelaPrendaPK;
    }

    public void setIdTelaPrendaPK(TelaPrendaPK idTelaPrendaPK) {
        this.idTelaPrendaPK = idTelaPrendaPK;
    }

    public Double getMetrosPorPrenda() {
        return metrosPorPrenda;
    }

    public void setMetrosPorPrenda(Double metrosPorPrenda) {
        this.metrosPorPrenda = metrosPorPrenda;
    }

    public Prenda getPrenda() {
        return prenda;
    }

    public void setPrenda(Prenda prenda) {
        this.prenda = prenda;
    }

    public Tela getTela() {
        return tela;
    }

    public void setTela(Tela tela) {
        this.tela = tela;
    }
}
