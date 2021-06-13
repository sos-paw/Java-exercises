package com.company.devices;

public class Phone {
    String producer;
    String model;
    String operationSystem;
    Double screenSize;

    public Phone(String producer, String model, String operationSystem, Double screenSize) {
        this.producer = producer;
        this.model = model;
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
}