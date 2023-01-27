package com.daniel.OdetteLane.persistence.entity.infoPrenda;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "\"Tipo_Prenda\"")
public class TipoPrenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"Co_idTipoPrenda\"")
    private Integer idTipoPrenda;
    @Column(name = "\"No_Tipo\"")
    private String nombreTipo;
    @Column(name = "\"Tx_Descripcion\"")
    private String descripcion;

    @OneToMany(mappedBy = "tipoPrenda", cascade = CascadeType.ALL)
    private List<Modelo> modelos;

    public Integer getIdTipoPrenda() {
        return idTipoPrenda;
    }

    public void setIdTipoPrenda(Integer idTipoPrenda) {
        this.idTipoPrenda = idTipoPrenda;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Modelo> getModelos() {
        return modelos;
    }

    public void setModelos(List<Modelo> modelos) {
        this.modelos = modelos;
    }
}
