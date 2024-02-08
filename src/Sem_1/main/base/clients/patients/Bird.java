package Sem_1.main.base.clients.patients;

import Sem_1.main.base.clients.*;

import java.time.LocalDate;

public class Bird extends Patients implements Goable, Flyable{
    public Bird(String nickname, Owner owner, LocalDate birthDate,
                Illness illness, Double discount) {
        super(nickname, owner, birthDate, illness);
        this.discount = discount;
    }

    public Bird() {
        super();
    }


    @Override
    public void fly() {

    }

    @Override
    public void toGo() {

    }
}


