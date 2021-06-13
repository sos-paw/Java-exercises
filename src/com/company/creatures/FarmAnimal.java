package com.company.creatures;

public class FarmAnimal extends Animal implements Edbile {
    public FarmAnimal(String name,String species, Double weight) {
        super(name,species,weight);
    }

    @Override
    public void beEaten() {
        this.weight = 0.0;
        System.out.println(this.name + " " + this.species+" eaten");
    }
}
