package Sem_1.main;

import Sem_1.main.clients.*;
import Sem_1.main.medPersonal.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    public static void main(String[] args) {


        Doctor doctor1 = new Doctor("Петр", "Петров",  LocalDate.of(1975, 12, 12), new Office("Хирург"), 10);
        doctor1.medicalСheckup();
        doctor1.operation();

        Nurse nurse1 = new Nurse();

        List<MedicalServices> medPersonals = new ArrayList<>();
        medPersonals.add(doctor1);
        medPersonals.add(nurse1);
        System.out.println(medPersonals);
// todo не смог добавить метод для подсчета пациентов, при добавлении в список  выдает ошибку
//  каста наследников как Anymal.
    }
}