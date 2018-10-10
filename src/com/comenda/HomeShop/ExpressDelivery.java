package com.comenda.HomeShop;

public class ExpressDelivery implements Delivery {

    private String city;

    public ExpressDelivery(String city) {
        this.city = city;
    }


    @Override
    public double getPrice() {
        if (city.equals("Paris") || city.equals("paris")){
            return 6.99;
        }else {
            return 9.99;
        }

    }
}
