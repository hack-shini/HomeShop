package com.comenda.HomeShop;

public class Customer {

    // get = Donner   :::-> On récupère une valeur  || Lecture
    // set = Modifier :::-> On modifie une valeur   || Ecriture

    String fullname, adress;

    public Customer(String fullname, String adress) {
        this.fullname = fullname;
        this.adress = adress;
    }

    public String getFullname() {
        return fullname;
    }

    public String getAdress() {
        return adress;
    }
}
