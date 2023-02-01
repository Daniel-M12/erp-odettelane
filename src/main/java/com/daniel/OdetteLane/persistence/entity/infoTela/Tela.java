package com.daniel.OdetteLane.persistence.entity.infoTela;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.stereotype.Repository;

@Repository
public class Tela {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"Co_idTela\"")
    private Integer idTela;
    @Column(name = "\"No_Tela\"")
    private String tela;
    @Column(name = "\"Tx_Descripcion\"")
    private String descripcion;
    @Column(name = "\"Co_TipoTela\"")
    private Integer idTipoTela;
    @Column(name = "\"Co_Material\"")
    private Integer idMaterial;
    @Column(name = "\"Co_Color\"")
    private Integer idColor;

    public Integer getIdTela() {
        return idTela;
    }

    public void setIdTela(Integer idTela) {
        this.idTela = idTela;
    }

    public String getTela() {
        return tela;
    }

    public void setTela(String tela) {
        this.tela = tela;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getIdTipoTela() {
        return idTipoTela;
    }

    public void setIdTipoTela(Integer idTipoTela) {
        this.idTipoTela = idTipoTela;
    }

    public Integer getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(Integer idMaterial) {
        this.idMaterial = idMaterial;
    }

    public Integer getIdColor() {
        return idColor;
    }

    public void setIdColor(Integer idColor) {
        this.idColor = idColor;
    }
}
