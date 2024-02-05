package Sem_1.main.clients;

import java.time.LocalDate;

public class Bird extends Animal implements Goable, Flyable {
    public Bird(String nickname, Owner owner, LocalDate birthDate,
                Illness illness, Double discount) {
        super(nickname, owner, birthDate, illness);
        this.discount = discount;
    }

    public Bird() {
        super();
    }


    @Override
    public void toGo() {
    }
    @Override
    public void fly() {
    }

}