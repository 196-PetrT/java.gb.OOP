package Sem_1.main.base.medPersonal;

import java.time.LocalDate;

public class Nurse extends MedPersonal implements Сheckupable {
    public Nurse(String Name, String SeName, LocalDate birthDate, Office office) {
        super(Name, SeName, birthDate, office);

    }

    public Nurse() {
        super();
    }

    @Override
    public void getTimeOperations() {
        System.out.println("осмотр шел 10 минут");
    }

}