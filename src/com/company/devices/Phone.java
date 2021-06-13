package com.company.devices;

public class Phone extends Device {

    String operationSystem;
    Double screenSize;

    public Phone(String producer, String model, String operationSystem, Double screenSize, Integer yearOfProduction) {
        super(producer,model,yearOfProduction);
        this.operationSystem = operationSystem;
        this.screenSize = screenSize;
    }

    String getOSVersion(){
        return "4.23.1";
    }


    @Override
    public String toString() {
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", operationSystem='" + operationSystem + '\'' +
                ", screenSize=" + screenSize +
                '}';
    }
    @Override
    public void turnOn() {
        System.out.println(this.producer+' '+this.model +" is now enabled");
    }
}