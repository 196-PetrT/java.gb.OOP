package Sem_1.main.medPersonal;

import java.time.LocalDate;

public class Doctor extends MedicalServices implements Operationable, Сheckupable {
    public Doctor(String Name, String SeName, LocalDate birthDate, Office office, int seniority) {
        super(Name, SeName, birthDate, office, seniority);

    }

    public Doctor() {
        super();
    }
    @Override
    public void operation() {
    }



    @Override
    public void medicalСheckup() {
    }
}