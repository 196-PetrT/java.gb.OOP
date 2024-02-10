package Sem_4.drugstore;


import Sem_4.drugstore.components.Azitronite;
import Sem_4.drugstore.components.Penicillin;
import Sem_4.drugstore.components.Water;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DrugMain {
    public static void main(String[] args) {
        Component water = new Water("water", 10D, 1);
        Component azitronite = new Azitronite("azitronite", 2D, 14);
        Component penicillin = new Penicillin("penicillin", 1.6D, 6);


        PharmacyTwo p1 = new PharmacyTwo();
        p1.addComponents(water, azitronite);

        PharmacyTwo p2 = new PharmacyTwo();
        p2.addComponents(penicillin, water);

        PharmacyTwo p3 = new PharmacyTwo();
        p3.addComponents(azitronite,penicillin);

        PharmacyTwo p4 = new PharmacyTwo();
        p4.addComponents(azitronite,water,water,penicillin);

        PharmacyTwo p5 = new PharmacyTwo();
        p5.addComponents(penicillin);

//        Iterator<Component> iterator = p1;
//        Iterator<Component> iterator2 = p2;
//
//        while(iterator.hasNext()){
//            System.out.println(p1.next().toString());
//        }
//        while(iterator2.hasNext()){
//            System.out.println(p2.next().toString());
//        }
//        for (Component c :p2){
//            System.out.println(c);
//        }


//        List<Component> components = new ArrayList<>();
//        components.add(azitronite);
//        components.add(water);
//        components.add(penicillin);
//
//
//        System.out.println(components);
//        Collections.sort(components, Comparator.reverseOrder());
//        System.out.println(components);

        // Сортировка по весу

        List<PharmacyTwo> pharmacy = new ArrayList<>();
        pharmacy.add(p1);
        pharmacy.add(p2);
        pharmacy.add(p3);
        pharmacy.add(p4);
        pharmacy.add(p5);
        System.out.println(pharmacy);
        Collections.sort(pharmacy);
        System.out.println(pharmacy);

        // ---------------- Доп задание(сортировка по силе, и если сила 0, то по весу) --------------
        Pharmacy a1 = new Pharmacy();
        Pharmacy a2 = new Pharmacy();
        Pharmacy a3 = new Pharmacy();
        Pharmacy a4 = new Pharmacy();

        a1.addComponents(azitronite,water);
        a2.addComponents(water);
        a3.addComponents(penicillin, water);
        a4.addComponents(water,penicillin,azitronite);

        List<Pharmacy> secondList = new ArrayList<>();
        secondList.add(a1);
        secondList.add(a2);
        secondList.add(a3);
        secondList.add(a4);

        System.out.println(secondList);
        Collections.sort(secondList);
        System.out.println(secondList);

    }
}
