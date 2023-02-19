package com.daniel.OdetteLane.persistence.entity.infoTela;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "\"Material_Tela\"")
public class MaterialTela {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"Co_idMaterial\"")
    private Integer idMaterialTela;
    @Column(name = "\"No_Material\"")
    private String nombreMaterial;
    @Column(name = "\"Tx_Composicion\"")
    private String composicion;
    @Column(name = "\"Tx_Descripcion\"")
    private String descripcion;

    @OneToMany(mappedBy = "materialTela", cascade = CascadeType.ALL)
    private List<Tela> telas;

    public Integer getIdMaterialTela() {
        return idMaterialTela;
    }

    public void setIdMaterialTela(Integer idMaterialTela) {
        this.idMaterialTela = idMaterialTela;
    }

    public String getNombreMaterial() {
        return nombreMaterial;
    }

    public void setNombreMaterial(String nombreMaterial) {
        this.nombreMaterial = nombreMaterial;
    }

    public String getComposicion() {
        return composicion;
    }

    public void setComposicion(String composicion) {
        this.composicion = composicion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Tela> getTelas() {
        return telas;
    }

    public void setTelas(List<Tela> telas) {
        this.telas = telas;
    }
}
