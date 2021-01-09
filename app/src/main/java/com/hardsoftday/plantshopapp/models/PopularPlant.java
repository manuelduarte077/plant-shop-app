package com.hardsoftday.plantshopapp.models;

public class PopularPlant {

    String popularId;
    String popularName;

    public PopularPlant(String popularId, String popularName) {
        this.popularId = popularId;
        this.popularName = popularName;
    }

    public String getPopularId() {
        return popularId;
    }

    public void setPopularId(String popularId) {
        this.popularId = popularId;
    }

    public String getPopularName() {
        return popularName;
    }

    public void setPopularName(String popularName) {
        this.popularName = popularName;
    }

}
