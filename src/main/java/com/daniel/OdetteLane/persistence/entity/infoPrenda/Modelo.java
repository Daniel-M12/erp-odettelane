package com.daniel.OdetteLane.persistence.entity.infoPrenda;

import jakarta.persistence.*;

import java.util.List;

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
    private Integer idTipoPrenda;

    @OneToMany(mappedBy = "modelo", cascade = CascadeType.ALL)
    private List<Prenda> prendas;
    @ManyToOne
    @JoinColumn(name = "\"Co_idTipo\"", insertable = false, updatable = false)
    private TipoPrenda tipoPrenda;

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

    public Integer getIdTipoPrenda() {
        return idTipoPrenda;
    }

    public void setIdTipoPrenda(Integer idTipoPrenda) {
        this.idTipoPrenda = idTipoPrenda;
    }

    public List<Prenda> getPrendas() {
        return prendas;
    }

    public void setPrendas(List<Prenda> prendas) {
        this.prendas = prendas;
    }

    public TipoPrenda getTipoPrenda() {
        return tipoPrenda;
    }

    public void setTipoPrenda(TipoPrenda tipoPrenda) {
        this.tipoPrenda = tipoPrenda;
    }
}
