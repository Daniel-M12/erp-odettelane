package com.daniel.OdetteLane.domain.entities.garment;

import java.math.BigDecimal;
import java.util.List;

public class Garment {
    private int garmentId;
    private int modelId;
    private int sizeId;
    private BigDecimal cost;
    private String description;
    private Model model;
    private Size size;

    private List<GarmentFabric> fabrics;

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

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public List<GarmentFabric> getFabrics() {
        return fabrics;
    }

    public void setFabrics(List<GarmentFabric> fabrics) {
        this.fabrics = fabrics;
    }
}
