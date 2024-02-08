package Sem_1.main.base;


import Sem_1.main.base.clients.Flyable;
import Sem_1.main.base.clients.Goable;
import Sem_1.main.base.clients.Patients;
import Sem_1.main.base.clients.Swimable;
import Sem_1.main.base.medPersonal.MedPersonal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VeterinaryClinic implements Iterator<String> {

    private List<Patients> patients;
    private List<MedPersonal> medPersonals;

    private List<Goable> listToGo;
    private List<Flyable> listFly;
    private List<Swimable> listSwim;
    private int Index;

    public VeterinaryClinic(){
        this.patients = new ArrayList<>();
        this.medPersonals = new ArrayList<>();
        this.listToGo = new ArrayList<>();
        this.listFly = new ArrayList<>();
        this.listSwim = new ArrayList<>();
    }

    public List<Patients> getPatients() {
        return patients;
    }

    public void addPatient(Patients patient) {
        patients.add(patient);
    }

    public void getNumPatients() {
        System.out.println("Всего на лечении " + patients.size() + " пациент(а, ов)");
    }

    public List<MedPersonal> getMedPersonal() {
        return medPersonals;
    }

    public void addMedPersonals(MedPersonal personal) {
        medPersonals.add(personal);
    }
    //
    public List<Goable> getGoable() {
        for (Patients p: patients
             ) {
            if (p instanceof Goable) listToGo.add((Goable) p);
        }
        return listToGo;

    }
    public List<Flyable> getFlyable() {
        for (Patients p: patients
        ) {
            if (p instanceof Flyable) listFly.add((Flyable) p);
        }
        return listFly;
    }
    public List<Swimable> getSwimable() {
        for (Patients p: patients
        ) {
            if (p instanceof Swimable) listSwim.add((Swimable) p);
        }
        return listSwim;
    }



    public void getTimeOperations() {
        System.out.println("осмотр шел 10 минут");
    }

    public void medicalСheckup() {
        System.out.println("Первичный осмотр проведен!");
    }
    public void operation() {
        System.out.println("Операция проведена!");
    }

    @Override
    public boolean hasNext() {
        return Index++ < patients.size();
    }

    @Override
    public String next() {
        return null;
    }
}
