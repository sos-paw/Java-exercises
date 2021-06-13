package com.company.devices;

import com.company.Human;
import com.company.salleable;

public class Phone extends Device implements salleable {

    String operationSystem;
    Double screenSize;

    public Phone(String producer, String model, String operationSystem, Double screenSize, Integer yearOfProduction) {
        super(producer,model,yearOfProduction);
        this.operationSystem = operationSystem;
        this.screenSize = screenSize;
    }

    String getOSVersion(){
        return "4.23.1";
    }


    @Override
    public String toString() {
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", operationSystem='" + operationSystem + '\'' +
                ", screenSize=" + screenSize +
                '}';
    }
    @Override
    public void turnOn() {
        System.out.println(this.producer+' '+this.model +" is now enabled");
    }

    @Override
    public void sell(Human buyer, Human seller, Double price) {
        if(seller.mobilePhone != null) {
            if (buyer.getCash() >= price)
            {
                buyer.mobilePhone=this;
                seller.mobilePhone=null;
                buyer.setCash(-price);
                seller.setCash(price);
                System.out.println(buyer.toString() + " buy " + this.toString() + " from " + seller.toString() + " for " + price + "PLN");
            }
            else
            {
                System.out.println(buyer.toString() + " no money");
            }
        }
        else
        {
            System.out.println(seller.toString() + " dont have phone");
        }
    }
}