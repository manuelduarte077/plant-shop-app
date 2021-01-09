package com.hardsoftday.plantshopapp.models;

public class Plant {

    Integer  plantID;
    String   plantName;
    String   plantPrice;
    Integer  plantImage;
    Integer  plantHeart;
    Integer  plantPluss;

    public Plant(Integer plantID, String plantName, String plantPrice, Integer plantImage, Integer plantHeart, Integer plantPluss) {
        this.plantID = plantID;
        this.plantName = plantName;
        this.plantPrice = plantPrice;
        this.plantImage = plantImage;
        this.plantHeart = plantHeart;
        this.plantPluss = plantPluss;
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

    public Integer getPlantHeart() {
        return plantHeart;
    }

    public void setPlantHeart(Integer plantHeart) {
        this.plantHeart = plantHeart;
    }

    public Integer getPlantPluss() {
        return plantPluss;
    }

    public void setPlantPluss(Integer plantPluss) {
        this.plantPluss = plantPluss;
    }
}
