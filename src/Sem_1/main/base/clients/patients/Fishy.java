package Sem_1.main.base.clients.patients;

import Sem_1.main.base.clients.Patients;
import Sem_1.main.base.clients.Illness;
import Sem_1.main.base.clients.Owner;
import Sem_1.main.base.clients.Swimable;

import java.time.LocalDate;

public class Fishy extends Patients implements Swimable {
    public Fishy(String nickname, Owner owner, LocalDate birthDate,
                 Illness illness, Double discount) {
        super(nickname, owner, birthDate, illness);
        this.discount = discount;
    }

    public Fishy() {
        super();
    }

    @Override
    public void swim() {

    }

}