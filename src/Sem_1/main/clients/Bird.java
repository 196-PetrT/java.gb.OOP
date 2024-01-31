package Sem_1.main.clients;

import java.time.LocalDate;

public class Bird extends Animal {
    public Bird(String nickname, Owner owner, LocalDate birthDate,
                Illness illness, Double discount) {
        super(nickname, owner, birthDate, illness);
        this.discount = discount;
    }

    public Bird() {
        super();
    }


    @Override
    public void swim(){
        System.out.println(nickname + " is not swimming!");
    }
}