package com.daniel.OdetteLane.domain.entities.fabric;

public class Fabric {
    private int fabricId;
    private String fabricName;
    private String description;
    private int fabricTypeId;
    private int materialId;
    private int colorId;

    private Colour colour;
    private FabricType fabricType;
    private FabricMaterial fabricMaterial;

    public int getFabricId() {
        return fabricId;
    }

    public void setFabricId(int fabricId) {
        this.fabricId = fabricId;
    }

    public String getFabricName() {
        return fabricName;
    }

    public void setFabricName(String fabricName) {
        this.fabricName = fabricName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getFabricTypeId() {
        return fabricTypeId;
    }

    public void setFabricTypeId(int fabricTypeId) {
        this.fabricTypeId = fabricTypeId;
    }

    public int getMaterialId() {
        return materialId;
    }

    public void setMaterialId(int materialId) {
        this.materialId = materialId;
    }

    public int getColorId() {
        return colorId;
    }

    public void setColorId(int colorId) {
        this.colorId = colorId;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public FabricType getFabricType() {
        return fabricType;
    }

    public void setFabricType(FabricType fabricType) {
        this.fabricType = fabricType;
    }

    public FabricMaterial getFabricMaterial() {
        return fabricMaterial;
    }

    public void setFabricMaterial(FabricMaterial fabricMaterial) {
        this.fabricMaterial = fabricMaterial;
    }
}
