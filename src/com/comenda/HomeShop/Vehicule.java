package com.comenda.HomeShop;

public abstract class Vehicule {



    // get = Donner   :::-> On récupère une valeur  || Lecture
    // set = Modifier :::-> On modifie une valeur   || Ecriture


    private String description;
    private String manufacturer;
    private String modelName;
    private String color;
    private int speed;
    private int year;
    private int weight;
    private int[] dimensions;

    public Vehicule(String description, String manufacturer, String modelName, String color, int speed, int year, int weight, int[] dimensions) {
        this.description = description;
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.color = color;
        this.speed = speed;
        this.year = year;
        this.weight = weight;
        this.dimensions = dimensions;
    }


    public abstract void start();

    public abstract void stop();

    public String getDescription() {
        return description;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModelName() {
        return modelName;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    public int getYear() {
        return year;
    }

    public int getWeight() {
        return weight;
    }

    public int[] getDimensions() {
        return dimensions;
    }
}
