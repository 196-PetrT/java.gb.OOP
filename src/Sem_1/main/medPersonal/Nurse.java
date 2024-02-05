package Sem_1.main.medPersonal;

import java.time.LocalDate;

public class Nurse extends MedicalServices implements Сheckupable {
    public Nurse(String Name, String SeName, LocalDate birthDate, Office office, int seniority) {
        super(Name, SeName, birthDate, office, seniority);
        getTimeOperations();
    }

    public Nurse() {
        super();
    }
    @Override
    public void getTimeOperations() {
        System.out.println("осмотр шел 10 минут");
    }
    @Override
    public void medicalСheckup() {
    }
}