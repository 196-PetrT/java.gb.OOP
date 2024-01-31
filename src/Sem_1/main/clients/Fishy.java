package Sem_1.main.clients;

import java.time.LocalDate;

public class Fishy extends Animal {
    public Fishy(String nickname, Owner owner, LocalDate birthDate,
                Illness illness, Double discount) {
        super(nickname, owner, birthDate, illness);
        this.discount = discount;
    }

    public Fishy() {
        super();
    }

    @Override
    public void fly(){
        System.out.println(nickname + " is not flying!");
    }
}