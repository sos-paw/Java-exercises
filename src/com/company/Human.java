package com.company;
import java.util.Date;
public class Human {
    String firstName;
    String lastName;
    Integer age;
    String sex;
    //Phone mobilePhone;
    Animal pet;
    Car car;
    private Double salary;

    public Human(Double salary){
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




}