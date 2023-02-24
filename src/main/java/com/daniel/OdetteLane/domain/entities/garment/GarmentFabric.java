package com.daniel.OdetteLane.domain.entities.garment;

import com.daniel.OdetteLane.domain.entities.fabric.Fabric;

public class GarmentFabric {
    private int garmentId;
    private Double metersPerGarment;

    //private Prenda prenda;
    private Fabric fabric;
    //private String fabricName;
    //private String modelName;

    //private String colourName;

    public int getGarmentId() {
        return garmentId;
    }

    public void setGarmentId(int garmentId) {
        this.garmentId = garmentId;
    }

    public Double getMetersPerGarment() {
        return metersPerGarment;
    }

    public void setMetersPerGarment(Double metersPerGarment) {
        this.metersPerGarment = metersPerGarment;
    }

    public Fabric getFabric() {
        return fabric;
    }

    public void setFabric(Fabric fabric) {
        this.fabric = fabric;
    }
}
