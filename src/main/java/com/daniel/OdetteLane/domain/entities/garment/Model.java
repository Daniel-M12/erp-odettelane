package com.daniel.OdetteLane.domain.entities.garment;

public class Model {
    private int modelId;
    private String model;
    private String description;
    private int garmentTypeId;
    private GarmentType garmentType;

    public int getModelId() {
        return modelId;
    }

    public void setModelId(int modelId) {
        this.modelId = modelId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public GarmentType getGarmentType() {
        return garmentType;
    }

    public void setGarmentType(GarmentType garmentType) {
        this.garmentType = garmentType;
    }

    public int getGarmentTypeId() {
        return garmentTypeId;
    }

    public void setGarmentTypeId(int garmentTypeId) {
        this.garmentTypeId = garmentTypeId;
    }
}
