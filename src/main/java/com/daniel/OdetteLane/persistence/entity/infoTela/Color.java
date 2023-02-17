package com.daniel.OdetteLane.persistence.entity.infoTela;

import jakarta.persistence.*;

@Entity
@Table(name = "\"Color\"")
public class Color {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"Co_idColor\"")
    private Integer idColor;
    @Column(name = "\"No_Color\"")
    private String nombre;

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
}
