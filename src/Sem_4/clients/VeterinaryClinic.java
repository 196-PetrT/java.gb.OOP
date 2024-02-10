package Sem_4.clients;



import Sem_4.clients.animals.Animal;
import Sem_4.clients.animals.Flyable;
import Sem_4.clients.animals.Goable;
import Sem_4.clients.animals.Swimable;
import Sem_4.staff.Worker;

import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {

    protected ArrayList<Worker> staff;
    protected ArrayList<Animal> patients;

    public VeterinaryClinic(ArrayList<Worker> staff, ArrayList<Animal> patients) {
        this.patients = patients;
        this.staff = staff;
    }

    public VeterinaryClinic() {
        patients = new ArrayList<>();
        staff = new ArrayList<>();
    }




    // Методы получения всех бегающих, всех плавающих и всех летающих
    public List<Animal> getSwimmers() {

        List<Animal> result = new ArrayList<>();

        for (int i = 0; i < patients.size(); i++) {
            if (patients.get(i) instanceof Swimable) {
                result.add(patients.get(i));
            }
        }
        System.out.println("Количество плавающих животных: " + result.size());
        return result;
    }

    public List<Animal> getFlyers() {

        List<Animal> result = new ArrayList<>();

        for (int i = 0; i < patients.size(); i++) {
            if (patients.get(i) instanceof Flyable) {
                result.add(patients.get(i));
            }
        }
        System.out.println("Количество летающих животных: " + result.size());
        return result;
    }

    public List<Animal> getRunners() {

        List<Animal> result = new ArrayList<>();

        for (int i = 0; i < patients.size(); i++) {
            if (patients.get(i) instanceof Goable) {
                result.add(patients.get(i));
            }
        }
        System.out.println("Количество бегающих животных: " + result.size());
        return result;
    }

    // Методы для работы с персоналом и животными:

    public void setPatients(ArrayList<Animal> patients) {
        this.patients = patients;
    }

    public void setStaff(ArrayList<Worker> staff) {
        this.staff = staff;
    }

    public ArrayList<Worker> addWorker(Worker worker) {
        if (!staff.contains(worker)) {
            staff.add(worker);
        }
        return staff;
    }

    public ArrayList<Animal> addPatient(Animal animal) {
        if (!patients.contains(animal)) {
            patients.add(animal);
        }
        return patients;
    }

    public ArrayList<Worker> delWorker(Worker worker) {
        if (staff.contains(worker)) {
            staff.remove(worker);
        }
        return staff;
    }


    public ArrayList<Animal> delPatient(Animal animal) {
        if (patients.contains(animal)) {
            patients.remove(animal);
        }
        return patients;

    }


}




