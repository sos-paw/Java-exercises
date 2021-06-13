package com.company.devices;

import com.company.Human;
import com.company.salleable;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
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

}