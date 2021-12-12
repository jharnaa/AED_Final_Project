/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BarChart;

/**
 *
 * @author mrunalbhalerao
 */
public class Report {
 private float carbonEmissionFabricType;
    private float waterToxinFabricType;
    private float wasteFabricType;

    private float carbonEmissionDesignTechnique;
    private float waterToxinDesignTechnque;
    private float wasteDesignTechnique;

    private float carbonEmissionManufacturingProcess;
    private float waterToxinManufacturingProcess;
    private float wasteManufacturingProcess;

    private float cumCarbonEmission;
    private float cumWaterToxin;
    private float cumWaste;

    public float getCarbonEmissionFabricType() {
        return carbonEmissionFabricType;
    }

    public void setCarbonEmissionFabricType(float carbonEmissionFabricType) {
        this.carbonEmissionFabricType = carbonEmissionFabricType;
    }

    public float getWaterToxinFabricType() {
        return waterToxinFabricType;
    }

    public void setWaterToxinFabricType(float waterToxinFabricType) {
        this.waterToxinFabricType = waterToxinFabricType;
    }

    public float getWasteFabricType() {
        return wasteFabricType;
    }

    public void setWasteFabricType(float wasteFabricType) {
        this.wasteFabricType = wasteFabricType;
    }

    public float getCarbonEmissionDesignTechnique() {
        return carbonEmissionDesignTechnique;
    }

    public void setCarbonEmissionDesignTechnique(float carbonEmissionDesignTechnique) {
        this.carbonEmissionDesignTechnique = carbonEmissionDesignTechnique;
    }

    public float getWaterToxinDesignTechnque() {
        return waterToxinDesignTechnque;
    }

    public void setWaterToxinDesignTechnque(float waterToxinDesignTechnque) {
        this.waterToxinDesignTechnque = waterToxinDesignTechnque;
    }

    public float getWasteDesignTechnique() {
        return wasteDesignTechnique;
    }

    public void setWasteDesignTechnique(float wasteDesignTechnique) {
        this.wasteDesignTechnique = wasteDesignTechnique;
    }

    public float getCarbonEmissionManufacturingProcess() {
        return carbonEmissionManufacturingProcess;
    }

    public void setCarbonEmissionManufacturingProcess(float carbonEmissionManufacturingProcess) {
        this.carbonEmissionManufacturingProcess = carbonEmissionManufacturingProcess;
    }

    public float getWaterToxinManufacturingProcess() {
        return waterToxinManufacturingProcess;
    }

    public void setWaterToxinManufacturingProcess(float waterToxinManufacturingProcess) {
        this.waterToxinManufacturingProcess = waterToxinManufacturingProcess;
    }

    public float getWasteManufacturingProcess() {
        return wasteManufacturingProcess;
    }

    public void setWasteManufacturingProcess(float wasteManufacturingProcess) {
        this.wasteManufacturingProcess = wasteManufacturingProcess;
    }

    public float getCumCarbonEmission() {
        return cumCarbonEmission;
    }

    public void setCumCarbonEmission(float cumCarbonEmission) {
        this.cumCarbonEmission = cumCarbonEmission;
    }

    public float getCumWaterToxin() {
        return cumWaterToxin;
    }

    public void setCumWaterToxin(float cumWaterToxin) {
        this.cumWaterToxin = cumWaterToxin;
    }

    public float getCumWaste() {
        return cumWaste;
    }

    public void setCumWaste(float cumWaste) {
        this.cumWaste = cumWaste;
    }

    
}
