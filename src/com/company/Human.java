package com.company;
import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Komparator;
import com.company.devices.Phone;
import java.util.Arrays;
import java.util.Date;
public class Human extends Animal {
    private static final String HUMAN_SPECIES = "homosapiens";
    private static final int DEFAULT_GARAGE_SIZE = 5;
    String firstName;
    String lastName;

    public Human(String name, String species, Double weight, String firstName, String lastName, Car[] garage) {
        super(name, species, weight);
        this.firstName = firstName;
        this.lastName = lastName;
        this.garage = garage;
    }

    public Phone mobilePhone;
    public Animal pet;
    private Car garage[];
    private Double salary;
    private Double cash;
    public Human(Double salary,Double cash){
        super("human",HUMAN_SPECIES,80.0);
        this.salary = salary;
        this.cash=cash;
        this.garage=new Car[DEFAULT_GARAGE_SIZE];
    }
    public void setCash(Double cash)
    {
        this.cash = cash;
    }
    public Double getCash()
    {
        return cash;
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
    public Car getCar(Integer parkNumber){
        return this.garage[parkNumber];
    }
    public void setCar(Car car,Integer parkNumber){
        if(this.salary > car.getValue()){
            System.out.println("udało się kupić za gotówkę");
            this.garage[parkNumber] = car;
        }
        else if(this.salary > car.getValue()/12.0){
            System.out.println("udało się kupić na kredyt (no trudno)");
            this.garage[parkNumber] = car;
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
                ", garagesize=" + garage.length +
                ", salary=" + salary +
                '}';
    }

    public void sell(Human seller, Human buyer, Double price){
        System.out.println("Nie możesz sprzedać człowieka, oszalałeś!?");
    }

    public Double carsValue() {
        double all = 0.0;
        for (Car cars : garage) {
            if (cars != null) {
                all += cars.value;
            }
        }
        return all;
    }

    public boolean haveCar(Car car) {
        for(int i=0;i<this.garage.length;i++){
            if(car==this.garage[i])
                return true;
        }
        return false;
    }

    public boolean haveFreeSpace() {
        for (int i=0;i< this.garage.length;i++) {
            if (this.garage[i]==null) {
                return true;
            }
        }
        return false;
    }

    public void removeCar(Car car) {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == car) {
                this.garage[i] = null;
            }
        }
    }

    public void addCar(Car car) {
        for (int i = 0; i < this.garage.length; i++) {
                if (this.garage[i] == null) {
                    this.garage[i] = car;
                    break;
                }
            }
        }


    public void sort(){
        Komparator cars = new Komparator();
        Arrays.sort(garage, cars);
    }
}
