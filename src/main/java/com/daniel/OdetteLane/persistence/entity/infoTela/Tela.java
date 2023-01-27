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
}
