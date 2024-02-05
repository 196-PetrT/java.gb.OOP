package Sem_1.main;

import Sem_1.main.clients.*;
import Sem_1.main.medPersonal.*;
import Sem_1.main.VeterinaryClinic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        Cat cat1 =  new Cat("Barsic",
                new Owner("Petr"),
                LocalDate.of(2021, 12, 12),
                new Illness("bb"));

        Bird birdie1 = new Bird("Птичка", new Owner("non"),
                LocalDate.of(2023, 12, 31), new Illness("блохи"), 0d);

        Fishy fishball1 = new Fishy("Рыбка", new Owner("non"),
                LocalDate.of(2023, 12, 31), new Illness("плохо спит"), 0d);

        List<Goable> listToGo = new ArrayList<>();
        List<Flyable> listFly = new ArrayList<>();
        List<Swimable> listSwim = new ArrayList<>();

        listToGo.add(cat1);
        listFly.add(birdie1);
        listSwim.add(fishball1);

        List<Animal> patients = new ArrayList<>();
        patients.add(cat1);
        patients.add(birdie1);
        patients.add(fishball1);

        System.out.println("Всего на лечении: " + patients.size());
        System.out.println(patients);

    }

}
