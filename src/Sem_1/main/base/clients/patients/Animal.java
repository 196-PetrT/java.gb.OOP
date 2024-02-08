package Sem_1.main.base.clients.patients;

import Sem_1.main.base.clients.Illness;
import Sem_1.main.base.clients.Owner;
import Sem_1.main.base.clients.Patients;

import java.time.LocalDate;

public abstract class Animal extends Patients {
    public Animal(String nickname, Owner owner, LocalDate birthDate,
                  Illness illness) {
        super();
    }

    public Animal() {
        this("Кличка", new Owner("Владелец"), LocalDate.now(),
                new Illness("здоров"));
    }
    public String getNickname() {
        return nickname;
    }

    public Owner getOwner() {
        return owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Illness getIllness() {
        return illness;
    }

    public void setIllness(Illness illness) {
        this.illness = illness;
    }

}
