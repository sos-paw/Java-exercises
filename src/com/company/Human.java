package com.company;
import com.company.devices.Car;
import com.company.devices.Phone;

import java.util.Date;
public class Human extends Animal{
    private static final String HUMAN_SPECIES = "homosapiens";
    String firstName;
    String lastName;

    Phone mobilePhone;
    Animal pet;
    private Car car;
    private Double salary;

    public Human(Double salary){
        super(HUMAN_SPECIES);
        this.salary = salary;
    }
    public Double getSalary(){
        System.out.println("Pobrana wypłata: " + this.salary);
        System.out.println("Kiedy pobrano: " + new Date());
        return salary;
    }
    public void setSalary(Double salary){
        if(salary <0.0){
            System.out.println("za darmo nikt nie bedzie robic");
        }
        else{
            System.out.println("nowe dane zostały wysłane do systemu księgowego");
            System.out.println("konieczność odebrania aneksu do umowy od pani Hani z kadr");
            System.out.println("ZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać dochodu");
            this.salary = salary;
        }
    }
    public Car getCar(Car car){
        return car;
    }
    public void setCar(Car car){
        if(this.salary > car.getValue()){
            System.out.println("udało się kupić za gotówkę");
            this.car = car;
        }
        else if(this.salary > car.getValue()/12.0){
            System.out.println("udało się kupić na kredyt (no trudno)");
            this.car = car;
        }
        else{
            System.out.println("zapisz się na studia i znajdź nową robotę albo idź po podwyżkę");
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", pet=" + pet +
                ", car=" + car +
                ", salary=" + salary +
                '}';
    }
}