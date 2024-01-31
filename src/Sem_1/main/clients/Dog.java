package Sem_1.main.clients;

import java.time.LocalDate;

public class Dog extends Animal{
    Double discount;
    public Dog(String nickname, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickname, owner, birthDate, illness);
        this.discount = discount;
    }

    public Dog() {
        super();
        this.discount = 15D;
    }
}
