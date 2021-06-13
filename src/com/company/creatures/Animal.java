package com.company.creatures;

import com.company.Human;
import com.company.salleable;

public abstract class Animal implements salleable, Feedable {
    final String species;
    String name;
    public Double weight;
    public Integer age;
    public String sex;
    //static public final Double DEFAULT_ANIMAL_WEIGHT = 1.0;
    public Animal(String name,String species,Double weight) {
        this.species = species;
        this.name=name;
        this.weight=weight;

    }

    @Override
    public void feed(double foodWeight) {
        if(weight>0){
            this.weight +=foodWeight;
            System.out.println(this.name + " fed, weight now: " + this.weight);
        }
        else
        {
            System.out.println(
                    this.name + " dead"
            );
        }
    }

    @Override
    public void feed(){
        if(weight>0){
            this.weight +=1;
            System.out.println((this.name + " fed, weight now: " + this.weight));
        }
        else
        {
            System.out.println(
                    this.name + " dead"
            );
        }
    }
    void takeForAWalk(){
        if(weight>0){
            this.weight -=1;
            System.out.println("walk done, weight now: " + this.weight);
        }
        else{
            System.out.println(
                    "im dead"
            );

        }

    }


    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }


    @Override
    public void sell(Human buyer, Human seller, Double price) {
        if(seller.pet != null) {
            if (buyer.getCash() >= price)
            {
                buyer.pet = this;
                seller.pet = null;
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
            System.out.println(seller.toString() + " dont have pet");
        }
    }

}