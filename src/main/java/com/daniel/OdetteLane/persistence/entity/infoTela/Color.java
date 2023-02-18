package com.daniel.OdetteLane.persistence.entity.infoTela;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "\"Color\"")
public class Color {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"Co_idColor\"")
    private Integer idColor;
    @Column(name = "\"No_Color\"")
    private String nombre;

    @OneToMany(mappedBy = "color", cascade = CascadeType.ALL)
    private List<Tela> telas;

    public Integer getIdColor() {
        return idColor;
    }

    public void setIdColor(Integer idColor) {
        this.idColor = idColor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Tela> getTelas() {
        return telas;
    }

    public void setTelas(List<Tela> telas) {
        this.telas = telas;
    }
}
