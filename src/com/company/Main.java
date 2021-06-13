package com.company;
public class Main {
    public static void main(String[] args) {
        // write your code here
        Animal dog = new Animal("dog");
        dog.name="Szarik";
        Human me = new Human(10000.0);
        me.firstName="Pawel";
        Car peugeot=new Car("peugeot","308 SW",2015,35000.0);
        Double mySalary = me.getSalary();
        Double newSalary = mySalary * 1.2;
        me.setSalary(newSalary);


        me.setCar(peugeot);
    }
}