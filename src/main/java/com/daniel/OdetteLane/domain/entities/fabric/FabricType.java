package com.daniel.OdetteLane.domain.entities.fabric;

public class FabricType {
    private int fabricTypeId;
    private String fabricType;
    private String measurementUnitPrice;

    public int getFabricTypeId() {
        return fabricTypeId;
    }

    public void setFabricTypeId(int fabricTypeId) {
        this.fabricTypeId = fabricTypeId;
    }

    public String getFabricType() {
        return fabricType;
    }

    public void setFabricType(String fabricType) {
        this.fabricType = fabricType;
    }

    public String getMeasurementUnitPrice() {
        return measurementUnitPrice;
    }

    public void setMeasurementUnitPrice(String measurementUnitPrice) {
        this.measurementUnitPrice = measurementUnitPrice;
    }
}
