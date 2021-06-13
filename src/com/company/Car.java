package com.company;

public class Car {
    final String producer;
    final String model;
    final Integer yearOfProduction;
    Double value;
    public Car(String producer, String model, Integer yearOfProduction,Double value) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.value=value;
    }
    public Double getValue(){
        return value;
    }

}