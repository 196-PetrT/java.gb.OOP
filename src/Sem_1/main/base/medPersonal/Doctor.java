package Sem_1.main.base.medPersonal;

import Sem_1.main.base.VeterinaryClinic;

import java.time.LocalDate;

public class Doctor extends MedPersonal implements Operationable, Сheckupable {
    public Doctor(String Name, String SeName, LocalDate birthDate, Office office) {
        super(Name, SeName, birthDate, office);

    }

    public Doctor() {
        super();
    }

    @Override
    public void getTimeOperations() {
            System.out.println("операция шла 50 минут");
    }


}