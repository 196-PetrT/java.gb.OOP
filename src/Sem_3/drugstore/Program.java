package Sem_3.drugstore;

import Sem_3.drugstore.components.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Component water = new Water("Water", 10D, 1);

        Component azitronite = new Azintronite("Azintronite", 2D, 14);

        Component penicillin = new Penicillin("Penicillin", 1.6D, 6);

        Pharmacy2 p1 = new Pharmacy2();
        p1.addCompanents(water, penicillin);

        Pharmacy2 p2 = new Pharmacy2();
        p2.addCompanents(water, azitronite);

        Pharmacy2 p3 = new Pharmacy2();
        p3.addCompanents(penicillin, azitronite);

        List<Component> components = new ArrayList<>();

        components.add(azitronite);
        components.add(water);
        components.add(penicillin);

        System.out.println(components);
        Collections.sort(components);
        System.out.println(components);

//        Iterator<Component> iterator = p1;
//
//        while (iterator.hasNext()){
//            System.out.println(p1.next().toString());
//        }
        for (Component c : p2) {
            System.out.println(c);
        }



    }
}
