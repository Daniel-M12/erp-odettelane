package com.daniel.OdetteLane.domain.entities.fabric;

public class FabricMaterial {
    private int fabricMaterialId;
    private String fabricMaterial;
    private String composition;
    private String description;

    public int getFabricMaterialId() {
        return fabricMaterialId;
    }

    public void setFabricMaterialId(int fabricMaterialId) {
        this.fabricMaterialId = fabricMaterialId;
    }

    public String getFabricMaterial() {
        return fabricMaterial;
    }

    public void setFabricMaterial(String fabricMaterial) {
        this.fabricMaterial = fabricMaterial;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
