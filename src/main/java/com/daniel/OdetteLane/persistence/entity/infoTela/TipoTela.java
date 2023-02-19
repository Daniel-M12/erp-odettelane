package com.daniel.OdetteLane.persistence.entity.infoTela;

import jakarta.persistence.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Entity
@Table(name = "\"Tipo_de_Tela\"")
public class TipoTela {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"Co_idTipoTela\"")
    private Integer idTipoTela;
    @Column(name = "\"No_TipoTela\"")
    private String nombreTipoTela;
    @Column(name = "\"No_UnidadMedidaPrecio\"")
    private String unidadMedidaPrecio;

    @OneToMany(mappedBy = "tipoTela", cascade = CascadeType.ALL)
    private List<Tela> telas;

    public Integer getIdTipoTela() {
        return idTipoTela;
    }

    public void setIdTipoTela(Integer idTipoTela) {
        this.idTipoTela = idTipoTela;
    }

    public String getNombreTipoTela() {
        return nombreTipoTela;
    }

    public void setNombreTipoTela(String nombreTipoTela) {
        this.nombreTipoTela = nombreTipoTela;
    }

    public String getUnidadMedidaPrecio() {
        return unidadMedidaPrecio;
    }

    public void setUnidadMedidaPrecio(String unidadMedidaPrecio) {
        this.unidadMedidaPrecio = unidadMedidaPrecio;
    }

    public List<Tela> getTelas() {
        return telas;
    }

    public void setTelas(List<Tela> telas) {
        this.telas = telas;
    }
}
