package com.company.devices;

import java.util.Comparator;

public class KomparatorNazwa implements Comparator<Application> {
    public int compare(Application app1, Application app2) {

        int compare = app1.name.compareTo(app2.name);
        if(compare > 0) {
            return 1;
        }
        else if(compare < 0){
            return -1;
        }
        else{
            return 0;
        }
    }

}
