package com.hardsoftday.plantshopapp.models;

public class Plant {

    Integer  plantID;
    String   plantName;
    String   plantPrice;
    Integer  plantImage;

    public Plant(Integer plantID, String plantName, String plantPrice, Integer plantImage) {
        this.plantID = plantID;
        this.plantName = plantName;
        this.plantPrice = plantPrice;
        this.plantImage = plantImage;

    }

    public Integer getPlantID() {
        return plantID;
    }

    public void setPlantID(Integer plantID) {
        this.plantID = plantID;
    }

    public String getPlantName() {
        return plantName;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName;
    }

    public String getPlantPrice() {
        return plantPrice;
    }

    public void setPlantPrice(String plantPrice) {
        this.plantPrice = plantPrice;
    }

    public Integer getPlantImage() {
        return plantImage;
    }

    public void setPlantImage(Integer plantImage) {
        this.plantImage = plantImage;
    }
}
