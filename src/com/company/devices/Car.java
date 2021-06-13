package com.company.devices;
import java.util.Objects;
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
}