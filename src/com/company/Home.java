package com.company;

public class Home {
    private String size;
    private Model modelHome;
    private Color color;

    public String getSize() {
        return size;
    }

    public Model getModelHome() {
        return modelHome;
    }

    public Color getColor() {
        return color;
    }

    public Home() {
    }

    public Home(String size, Model modelHome, Color color) {
        this.size = size;
        this.modelHome = modelHome;
        this.color = color;
    }
}