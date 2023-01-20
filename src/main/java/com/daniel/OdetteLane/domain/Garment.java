package com.daniel.OdetteLane.domain;

import java.math.BigDecimal;

public class Garment {
    private int garmentId;
    private int modelId;
    private int sizeId;
    private BigDecimal cost;
    private String description;

    public int getGarmentId() {
        return garmentId;
    }

    public void setGarmentId(int garmentId) {
        this.garmentId = garmentId;
    }

    public int getModelId() {
        return modelId;
    }

    public void setModelId(int modelId) {
        this.modelId = modelId;
    }

    public int getSizeId() {
        return sizeId;
    }

    public void setSizeId(int sizeId) {
        this.sizeId = sizeId;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
