package com.comenda.HomeShop;

import com.comenda.HomeShop.Electro.Fridge;
import com.comenda.HomeShop.Electro.Television;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BillTest {

    private String outPut;
    private Writer writerMock = new Writer() {

        @Override
        public void start() {
            outPut = "";
        }

        @Override
        public void writeLine(String line) {
            outPut += line + "%n";
        }

        @Override
        public void stop() {
                    }
    };

    private Product cafe = new Product("Philips","Fait du café 1 - 2 Tasses", 79.99);
    private Television tv = new Television("LG OQLED", "Télèvision incurvé",1999,170, "LED");
    private Fridge fridge = new Fridge("BEKO","Frigo beko gris aluminium", 459.99, 460, false);

    private Customer customer2 = new Customer("Comenda Wyatt","Isère");

    private Delivery lowCostDelivery = new RelayDelivery(27);


    @Test
    public void Given_2productsAndDelivery_When_generatingBill_Then_getGoodLineNumber(){
        Bill bill = new Bill(customer2, lowCostDelivery);
        bill.addProduct(cafe,1);
        bill.addProduct(tv,1);
        bill.generate(writerMock);

        int lineNumber = outPut.split("\n").length;
        assertEquals(20,lineNumber);
    }


    @Test
    public void Given_3productsAndDelivery_When_GeneratingBillI_Then_getGoodTotal(){
        Bill bill = new Bill(customer2, lowCostDelivery);
        bill.addProduct(cafe,1);
        bill.addProduct(tv,1);
        bill.addProduct(fridge,1);

        assertEquals(2538,bill.getTotal(),0.01);
    }

}