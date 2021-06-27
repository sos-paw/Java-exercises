package com.company.devices;
import java.util.Comparator;
public class KomparatorCena implements Comparator<Application>{

    public int compare(Application app1, Application app2) {
        if(app1 == null && app2 == null) {
            return 0;
        }
        else if(app1 == null){
            return -1;
        }
        else if(app2 == null){
            return 1;
        }

        if(app1.price>app2.price){
            return 1;
        }
        else if(app1.price<app2.price) {
            return -1;
        }
        else {
            return 0;
        }




    }
}
