package com.comenda.HomeShop;

public class TakeAwayDelivery implements Delivery {

    @Override
    public double getPrice() {
        return 0.0;
    }

    @Override
    public String getInfo() {
        return "Take away delivery";
    }
}
