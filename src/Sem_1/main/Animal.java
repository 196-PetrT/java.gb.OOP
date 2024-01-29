package Sem_1.main;

import java.time.LocalDate;

public class Animal {
    String nickname;
    Owner owner;
    LocalDate birthDate;
    Illness illness;

    public Animal(String nickname, Owner owner, LocalDate birthDate,
                  Illness illness) {
        this.nickname = nickname;
        this.owner = owner;
        this.birthDate = birthDate;
        this.illness = illness;

    }

    public Animal() {

    }
}
