package com.daniel.OdetteLane.persistence.entity.infoPrenda;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "\"Prenda\"")
public class Prenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"Co_idPrenda\"")
    private Integer idPrenda;
    @Column(name = "\"Co_Modelo\"")
    private Integer idModeloPrenda;
    @Column(name = "\"Co_Talla\"")
    private Integer idTallaPrenda;
    @Column(name = "\"Ss_CostoPrenda\"")
    private BigDecimal costoPrenda;
    @Column(name = "\"Tx_Descripcion\"")
    private String descripcionPrenda;

    @ManyToOne
    @JoinColumn(name = "\"Co_Modelo\"", insertable = false, updatable = false)
    private Modelo modelo;

    @ManyToOne
    @JoinColumn(name = "\"Co_Talla\"", insertable = false, updatable = false)
    private Talla talla;

    public Integer getIdPrenda() {
        return idPrenda;
    }

    public void setIdPrenda(Integer idPrenda) {
        this.idPrenda = idPrenda;
    }

    public Integer getIdModeloPrenda() {
        return idModeloPrenda;
    }

    public void setIdModeloPrenda(Integer idModeloPrenda) {
        this.idModeloPrenda = idModeloPrenda;
    }

    public Integer getIdTallaPrenda() {
        return idTallaPrenda;
    }

    public void setIdTallaPrenda(Integer idTallaPrenda) {
        this.idTallaPrenda = idTallaPrenda;
    }

    public BigDecimal getCostoPrenda() {
        return costoPrenda;
    }

    public void setCostoPrenda(BigDecimal costoPrenda) {
        this.costoPrenda = costoPrenda;
    }

    public String getDescripcionPrenda() {
        return descripcionPrenda;
    }

    public void setDescripcionPrenda(String descripcionPrenda) {
        this.descripcionPrenda = descripcionPrenda;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Talla getTalla() {
        return talla;
    }

    public void setTalla(Talla talla) {
        this.talla = talla;
    }
}
