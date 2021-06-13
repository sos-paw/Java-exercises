package com.company;

public class Animal {
    final String species;
    String name;
    private Double weight;
    Integer age;
    String sex;
    static public final Double DEFAULT_ANIMAL_WEIGHT = 1.0;
    public Animal(String species) {
        this.species = species;

        switch(this.species){
            case "dog":this.weight = 20.0;break;
            case "cat":this.weight = 2.0;break;
            case "cow":this.weight = 400.0;break;
            default:this.weight = DEFAULT_ANIMAL_WEIGHT;
        }

    }



    void feed(){
        if(weight>0){
            this.weight +=1;
            System.out.println("im fed, weight now: " + this.weight);
        }
        else
        {
            System.out.println(
                    "im dead"
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
}