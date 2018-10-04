package com.comenda.HomeShop;

import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicule {


    // get = Donner   :::-> On récupère une valeur  || Lecture
    // set = Modifier :::-> On modifie une valeur   || Ecriture


    private int doors;
    private int consommation;
    private String typeMotor;
    private List<String> options = new ArrayList<String>();

    public Car(String description, String manufacturer, String modelName, String color, int speed, int year, int weight, int[] dimensions,
               int doors, int consommation, String typeMotor, List<String> options) {
        super(description, manufacturer, modelName, color, speed, year, weight, dimensions);
        this.doors = doors;
        this.consommation = consommation;
        this.typeMotor = typeMotor;
        this.options = options;
    }



    public void startHeadLight (){
        System.out.println("J'allume mes phares");

    }

    public void openChest (){
        System.out.println("J'ouvre mon coffre");
    }

    public int getDoors() {
        return doors;
    }

    public int getConsommation() {
        return consommation;
    }

    public String getTypeMotor() {
        return typeMotor;
    }

    public List<String> getOptions() {
        return options;
    }
}
