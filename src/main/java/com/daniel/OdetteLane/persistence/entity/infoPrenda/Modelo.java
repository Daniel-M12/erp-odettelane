package com.daniel.OdetteLane.persistence.entity.infoPrenda;

import jakarta.persistence.*;

@Entity
@Table(name = "\"Modelo_Prenda\"")
public class Modelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"Co_idModelo\"")
    private Integer modeloId;
    @Column(name = "\"No_Modelo\"")
    private String nombreModelo;
    @Column(name = "\"Tx_Descripcion\"")
    private String descripcion;
    @Column(name = "\"Co_idTipo\"")
    private Integer tipoPrenda;

    public Integer getModeloId() {
        return modeloId;
    }

    public void setModeloId(Integer modeloId) {
        this.modeloId = modeloId;
    }

    public String getNombreModelo() {
        return nombreModelo;
    }

    public void setNombreModelo(String nombreModelo) {
        this.nombreModelo = nombreModelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getTipoPrenda() {
        return tipoPrenda;
    }

    public void setTipoPrenda(Integer tipoPrenda) {
        this.tipoPrenda = tipoPrenda;
    }
}
