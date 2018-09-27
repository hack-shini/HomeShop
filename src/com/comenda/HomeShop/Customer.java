package com.comenda.HomeShop;

public class Customer {

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
