package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Pet;
import com.company.devices.*;

import java.net.MalformedURLException;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        // write your code here
        //Animal dog = new Animal("szarik","dog",40.5);





        Human me = new Human(10000.0,40000.0);
        Human slave = new Human(10.0,200.0);
        Human badMan = new Human(80000.0,120000.0);
        Human somsiad= new Human("somsiad","human",80.5,"Pawel","Oblakany",new Car[0]);
        me.firstName="Pawel";
        me.lastName="Sosnowski";
        me.age=22;
        me.sex="male";

        Car peugeot=new Diesel("peugeot","308 SW",2015,35000.0);
        Double mySalary = me.getSalary();
        Double newSalary = mySalary * 1.2;
        me.setSalary(newSalary);
        Car peugeot2=new Diesel("peugeot","308 SW",2015,35000.0);
        Phone xiaomi= new Phone("xiaomi","note 8 pro","4.1.2",6.4,2019);
        Car toyota=new Electric("toyota","prius",2012,400.0);
        Car opel=new LPG("opel","corsa",2005,100.0);

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

        try {
            xiaomi.installAnnApp("Spotify","5.10","spotify.pl");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        xiaomi.installAnApp("winamp");
        String[] apps = {"spotify", "tidal", "googlemusic"};
        xiaomi.installAnApp(apps);

        peugeot.refuel();
        toyota.refuel();
        opel.refuel();



        me.setCar(peugeot,0);
        me.setCar(toyota,2);
        me.setCar(opel,1);

        System.out.println(me.carsValue());



        System.out.println(me.getCar(0));
        System.out.println(me.getCar(1));
        System.out.println(me.getCar(2));
        System.out.println(me.getCar(3));
        System.out.println(me.getCar(4));
        me.sort();
        System.out.println(me.getCar(0));
        System.out.println(me.getCar(1));
        System.out.println(me.getCar(2));
        System.out.println(me.getCar(3));
        System.out.println(me.getCar(4));


        //peugeot.sell(slave,me, 9999999.0); //jak za to zaplacisz
        //peugeot.sell(me,slave, 10.0);       //ukradzione auto
        //peugeot.sell(somsiad,me,10.0); //brak miejsca
        //System.out.println(slave.getCar(0));//sprawdzenie powodzenia
        //peugeot.sell(slave,me, 9.0); //powodzenie
        //System.out.println(slave.getCar(0));//sprawdzenie powodzenia

        //peugeot.sell(badMan,slave,5.5);
        //peugeot.sell(me,badMan,15.5);
        //System.out.println(peugeot.numberOfTransactions());//liczba transakcji sprzedaży w których uczestniczył samochód
        //System.out.println(peugeot.isEverOwner(me));//czy jakiś człowiek był właścicielem pojazdu
        //System.out.println(peugeot.isAsoldB(me,slave));//czy człowiek A sprzedał samochód człowiekowi B

        System.out.println(me.getCash());
        xiaomi.owner=me;
        me.setCash(5000.0);
        Application spotify = new Application("Spotify","latest",15.0);
        Application tidal = new Application("Tidal","12.5",10.0);
        Application ytmusic = new Application("YouTube Music","10.9",4.0);
        Application winamp = new Application("Winamp","15.0",0.0);
        Application aimp = new Application("AIMP","10.9",0.0);
        xiaomi.installApp(spotify);
        xiaomi.installApp(ytmusic);
        xiaomi.installApp(winamp);
        xiaomi.installApp(aimp);
        System.out.println(me.getCash());

        System.out.println(xiaomi.isAppInstalled("Spotify"));
        System.out.println(xiaomi.isAppInstalled(spotify));
        System.out.println(xiaomi.isAppInstalled("Tidal"));
        System.out.println(xiaomi.isAppInstalled(tidal));
        xiaomi.freeApps();//Darmowe zainstalowane aplikacje
        System.out.println();
        System.out.println(xiaomi.allAppsValue());//wartosc wszystkich zainstalowanych appek
        System.out.println("sortowanie po cenie: ");
        xiaomi.appsByPrice();
        System.out.println();
        System.out.println();
        System.out.println("sortowanie po nazwie: ");
        xiaomi.appsByName();
    }
}