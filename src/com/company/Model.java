package com.company;

public class Model {
    public int yearBuilding;
    public String modelHome;

    public int getYearBuilding() {
        return yearBuilding;
    }

    public String getModelHome() {
        return modelHome;
    }

    public Model(int yearBuilding, String modelHome) {
        this.yearBuilding = yearBuilding;
        this.modelHome = modelHome;
    }


}
