package com.company.devices;

import com.company.Human;
import com.company.salleable;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class Phone extends Device implements salleable {

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

    Set<Application> apps = new LinkedHashSet();
    public Human owner;

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

    @Override
    public void sell(Human buyer, Human seller, Double price) {
        if(seller.mobilePhone != null) {
            if (buyer.getCash() >= price)
            {
                buyer.mobilePhone=this;
                seller.mobilePhone=null;
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
            System.out.println(seller.toString() + " dont have phone");
        }
    }

    static final String DEFAULT_APP_ADDRESS = "muzyka.pl";
    static final String DEFAULT_APP_PROTOCOL = "https";
    static final String DEFAULT_APP_VERSION = "latest";

    public void installAnApp(String appName) {
        this.installAnApp(appName, DEFAULT_APP_VERSION);
    }

    public void installAnApp(String[] appNames) {
        for (String appName : appNames) {
            this.installAnApp(appName);
        }
    }

    public void installAnApp(String appName, String version) {
        try {
            installAnnApp(appName, version, DEFAULT_APP_ADDRESS);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public void installAnnApp(String appName, String version, String appServer) throws MalformedURLException {
        URL url = new URL(DEFAULT_APP_PROTOCOL, DEFAULT_APP_ADDRESS, 666, appName + " " + version);
        installAnnApp(url);
    }

    private void installAnnApp(URL url) {
        System.out.println("app " + url.getFile() + " installed");
    }

    public void installApp(Application application){
        if(owner.getCash()>=application.price){
            apps.add(application);
            owner.setCash(owner.getCash()-application.price);
            System.out.println("udalo sie kupic i zainstalowac appke");
        }
        else{
            System.out.println("nie masz dosc pieniedzy! potrzebujesz: " + application.price);
        }
    }
    public boolean isAppInstalled(Application application){
        return apps.contains(application);
    }

    public boolean isAppInstalled(String name){
        List<Application> lista = new ArrayList<Application>(apps);
        for (int i = 0; i < lista.size(); i++) {
            if (name.equals(lista.get(i).name))
                return true;
        }
        return false;
    }
    public void freeApps(){
        List<Application> lista = new ArrayList<Application>(apps);
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).price == 0.0) {
                System.out.print(lista.get(i).name + ", ");
            }
        }
    }
    public Double allAppsValue() {
        Double value = 0.0;
        for (Application app : apps) {
            value += app.price;
        }

        return value;
    }
    public void appsByPrice(){
        List<Application> lista = new ArrayList<Application>(this.apps);
        KomparatorCena byprice = new KomparatorCena();
        Collections.sort(lista, byprice);
        for(Application app: lista){
            System.out.println("Name: " + app.name + "   price: " + app.price);
        }
    }
    public void appsByName(){
        List<Application> lista = new ArrayList<Application>(this.apps);
        KomparatorNazwa byname = new KomparatorNazwa();
        Collections.sort(lista, byname);
        for(Application app: lista){
            System.out.println("Name: " + app.name + "   price: " + app.price);
        }
    }
}