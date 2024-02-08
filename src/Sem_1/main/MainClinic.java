package Sem_1.main;

import Sem_1.main.base.clients.*;
import Sem_1.main.base.clients.patients.*;
import Sem_1.main.base.medPersonal.*;
import Sem_1.main.base.VeterinaryClinic;


import java.text.MessageFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MainClinic {
    public static void main(String[] args) {

        VeterinaryClinic clinic = new VeterinaryClinic();
//
//        List<Patients> patients = new ArrayList<>();
//        List<MedPersonal> medPersonals = new ArrayList<>();

        Doctor doctor1 = new Doctor("Петр", "Петров",  LocalDate.of(1975, 12, 12), new Office("Хирург"));

        Nurse nurse1 = new Nurse();


        Cat cat1 =  new Cat("Barsic", new Owner("Petr"),
                LocalDate.of(2021, 12, 12), new Illness("bb"));
        Dog dog1 =  new Dog("Бобик", new Owner("Petr"),
                LocalDate.of(2021, 12, 12), new Illness("bb"));

        Bird birdie1 = new Bird("Птичка", new Owner("non"),
                LocalDate.of(2023, 12, 31), new Illness("блохи"), 0d);

        Fishy fishball1 = new Fishy("Рыбка", new Owner("non"),
                LocalDate.of(2023, 12, 31), new Illness("плохо спит"), 0d);


//        System.out.println(clinic.getPatients());
        clinic.addPatient(cat1);
        clinic.addPatient(dog1);
        clinic.addPatient(birdie1);
        clinic.addPatient(fishball1);
        clinic.getNumPatients();
//        System.out.println(clinic.getPatients());
//
//
        System.out.println("Из них умеют ходить: ");
        System.out.println(clinic.getGoable());
//        System.out.println("Из них умеют плавать: ");
//        System.out.println(clinic.getSwimable());
//        System.out.println("Из них умеют летать: ");
//        System.out.println(clinic.getFlyable());
//        System.out.println(clinic.getMedPersonal());
        clinic.addMedPersonals(doctor1);
        clinic.addMedPersonals(nurse1);
//        System.out.println(clinic.getMedPersonal());
    }
}