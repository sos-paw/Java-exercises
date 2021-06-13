package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {
    public static void main(String[] args) {
        // write your code here
        //Animal dog = new Animal("szarik","dog",40.5);

        Human me = new Human(10000.0,40000.0);
        Human slave = new Human(10.0,200.0);
        Human badMan = new Human(80000.0,120000.0);
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
        //System.out.println(dog.toString());
        System.out.println(peugeot.toString());
        System.out.println(xiaomi.toString());

        xiaomi.turnOn();
        peugeot.turnOn();

        slave.sell(me,badMan,5.0);
        xiaomi.sell(slave,me,15.0);
        me.mobilePhone=xiaomi;
        xiaomi.sell(slave,me,99999999999999.0);
        xiaomi.sell(slave,me,15.0);

        Animal dog = new Pet("Szarik","dog",21.0);
        FarmAnimal pig = new FarmAnimal("Peppa","pig",250.9);

        dog.feed();
        dog.feed(10.5);
        pig.feed(10.5);
        pig.beEaten();
        pig.feed();
    }
}