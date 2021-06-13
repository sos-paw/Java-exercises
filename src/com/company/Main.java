package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Animal dog = new Animal("dog");
        dog.name="Szarik";
        Human me = new Human(10000.0);
        me.firstName="Pawel";
        me.lastName="Sosnowski";
        me.age=22;
        me.sex="male";

        Car peugeot=new Car("peugeot","308 SW",2015,35000.0);
        Double mySalary = me.getSalary();
        Double newSalary = mySalary * 1.2;
        me.setSalary(newSalary);
        Car peugeot2=new Car("peugeot","308 SW",2015,35000.0);
        Phone xiaomi= new Phone("xiaomi","note 8 pro","4.1.2",6.4,2019);
        me.mobilePhone=xiaomi;
        me.setCar(peugeot);
        boolean isEqual = peugeot.hashCode() == peugeot2.hashCode();
        if(isEqual == true){
            System.out.println("same");
        }else {
            System.out.println("different");
        }

        System.out.println((peugeot).equals(peugeot2));
        System.out.println(peugeot);
        System.out.println(peugeot2);
        System.out.println(me.toString());
        System.out.println(dog.toString());
        System.out.println(peugeot.toString());
        System.out.println(xiaomi.toString());

        xiaomi.turnOn();
        peugeot.turnOn();

    }
}