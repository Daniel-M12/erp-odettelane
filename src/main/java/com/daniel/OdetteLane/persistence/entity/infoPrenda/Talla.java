package com.daniel.OdetteLane.persistence.entity.infoPrenda;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "\"Talla\"")
public class Talla {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"Co_idTalla\"")
    private Integer idTalla;
    @Column(name = "\"Nu_Valor\"")
    private int valor;
    @Column(name = "\"Co_Categoria\"")
    private String categoria;

    @OneToMany(mappedBy = "talla", cascade = CascadeType.ALL)
    private List<Prenda> prendas;

    public Integer getIdTalla() {
        return idTalla;
    }

    public void setIdTalla(Integer idTalla) {
        this.idTalla = idTalla;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public List<Prenda> getPrendas() {
        return prendas;
    }

    public void setPrendas(List<Prenda> prendas) {
        this.prendas = prendas;
    }
}
