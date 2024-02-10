package Sem_4.clients;


import Sem_4.clients.animals.*;
import Sem_4.staff.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



public class Main3 {
    public static void main(String[] args) {

        Cat cat = new Cat("Bars", new Owner("george"), LocalDate.now(),new Illness("Lishay"), 10d);
        Dog dog = new Dog("jack", new Owner("john"), LocalDate.now(),new Illness("gribok"));
        Cat cat2 = new Cat();
        Cock cock = new Cock();
        Duck duck = new Duck();
        Hawk hawk = new Hawk();
        Penguin peng = new Penguin();
        Shark shark = new Shark();


        Doctor doc = new Doctor("Иван Сергеевич", "Хирург");
        Doctor doc2 = new Doctor("Сергей Иванович", "Глав. врач");
        Nurse nurse1 = new Nurse("Алла Генадьевна");
        Nurse nurse2 = new Nurse("Виктория Константиновна");
        Nurse nurse3 = new Nurse("Валерия Анатольевна");

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(duck);
        animals.add(shark);


        VeterinaryClinic vetClinic = new VeterinaryClinic();
        vetClinic.setPatients(animals);
        System.out.println(vetClinic.patients);
//        vetClinic.addPatient(cat);
//        vetClinic.addPatient(dog);
//        vetClinic.addPatient(cat2);
//        vetClinic.addPatient(cat);
//        vetClinic.addWorker(doc);
//        vetClinic.addWorker(doc2);
//        System.out.println(vetClinic.patients);
//        vetClinic.delPatient(cat);
//        System.out.println(vetClinic.patients);
//        System.out.println(vetClinic.staff);
//        vetClinic.delWorker(doc2);
//        System.out.println(vetClinic.staff);

        List<Animal> swimmers = new ArrayList<>(vetClinic.getSwimmers());
        System.out.println(swimmers);
        List<Animal> flyers = new ArrayList<>(vetClinic.getFlyers());
        System.out.println(flyers);
        List<Animal> runners = new ArrayList<>(vetClinic.getRunners());
        System.out.println(runners);

    }
}
