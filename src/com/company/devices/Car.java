package com.company.devices;
import com.company.Human;
import com.company.salleable;

import java.util.Objects;
public abstract class Car extends Device implements salleable {

    Double value;
    public Car(String producer, String model, Integer yearOfProduction,Double value) {
        super(producer, model, yearOfProduction);
        this.value=value;
    }
    public Double getValue(){
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(producer, car.producer) && Objects.equals(model, car.model) && Objects.equals(yearOfProduction, car.yearOfProduction) && Objects.equals(value, car.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer, model, yearOfProduction, value);
    }


    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", value=" + value +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println(this.producer+' '+this.model + " engine start");
    }


    @Override
    public void sell(Human buyer, Human seller, Double price) {
        if(seller.getCar() != null) {
            if (buyer.getCash() >= price)
            {
                buyer.setCar(seller.getCar());
                seller.setCar(null);
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
            System.out.println(seller.toString() + " dont have car");
        }
    }

    public abstract void refuel();
}