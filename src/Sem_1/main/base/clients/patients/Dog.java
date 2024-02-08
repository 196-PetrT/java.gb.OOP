package Sem_1.main.base.clients.patients;

import Sem_1.main.base.clients.*;

import java.time.LocalDate;

public class Dog extends Patients implements Goable, Swimable {

    public Dog(String nickname, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickname, owner, birthDate, illness);

        this.discount = 15D;
    }

    public Dog() {
        super();
    }
    @Override
    public void toGo() {
    }

    @Override
    public void swim() {


    }

}
