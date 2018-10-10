package com.comenda.HomeShop;

public class Plane extends Vehicule implements MoyenDeLocomotion {


    public Plane(String description, String manufacturer, String modelName, String color, int speed, int year, int weight, int[] dimensions) {
        super(description, manufacturer, modelName, color, speed, year, weight, dimensions);
    }

    @Override
    public void start() {
        System.out.println("Je suis un "+getModelName()+" et je vais m'nvoler !!");
    }

    @Override
    public void stop() {
        System.out.println("Je suis un "+getModelName()+" et je vais atterir");
    }

    @Override
    public void deplace(String adresse) {
        System.out.println("Je suis un avion et je vais à l'adresse suivante : "+adresse);
    }


}
