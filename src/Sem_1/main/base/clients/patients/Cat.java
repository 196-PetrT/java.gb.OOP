package Sem_1.main.base.clients.patients;

import Sem_1.main.base.clients.*;

import java.time.LocalDate;

// пример наследования, кошки чем-то отличаются)

public class Cat extends Patients implements Goable {

    public Cat(String nickname, Owner owner, LocalDate birthDate,
               Illness illness) {
        super(nickname, owner, birthDate, illness);
        this.discount = discount;
    }

    public Cat() {
        super();
        this.discount = 10D;

    }
    @Override
    public void toGo() {
    }


}
