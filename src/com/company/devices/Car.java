package com.company.devices;
import com.company.Human;
import com.company.salleable;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
public abstract class Car extends Device implements salleable {




    public Car(String producer, String model, Integer yearOfProduction,Double value) {
        super(producer, model, yearOfProduction);
        this.value=value;
    }
    public Double getValue(){
        return value;
    }

    List<Human> owners = new LinkedList<Human>();


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



    public void sell(Human buyer, Human seller, Double price) throws Exception{
        if(!seller.haveCar(this) && (owners.get(owners.size() - 1)) != seller){
            throw new Exception("UWAGA UKRADZIONE AUTO!");
        }
        if(!buyer.haveFreeSpace()){
            throw new Exception("a gdzie to chcesz trzymac!?");
        }
        if(buyer.getCash()<price){
            throw new Exception("jak za to zaplacisz!?");
        }
        seller.removeCar(this);
        buyer.addCar(this);
        seller.setCash(seller.getCash()+price);
        buyer.setCash(buyer.getCash()-price);
        System.out.println("sprzedano z powodzeniem!");
        owners.add(buyer);
    }

    public Boolean isEverOwner(Human owner) {
        return owners.contains(owner);
    }

    public Boolean isAsoldB(Human seller, Human buyer) {
        for (int i = 0; i < (owners.size() - 1); i++){
            if((owners.get(i) == seller) && (owners.get(i+1) == buyer)){
                return true;
            }
        }
        return false;
    }
    public int numberOfTransactions(){
        return (owners.size() -1) ;
    }

    public abstract void refuel();
}