package com.comenda.HomeShop;

public class Product {

    String name;
    String description;
    double price;

    // get = Donner   :::-> On récupère une valeur  || Lecture
    // set = Modifier :::-> On modifie une valeur   || Ecriture


    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    /**
     * Display a description of the product
     */

    public void look(){

    }


    /**
     * Add the product to a com.comenda.HomeShop.Bill
     * @param bill Display a bill
     * @param quantity Display a quantity of the product
     */

    public void buy (Bill bill, int quantity){

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
