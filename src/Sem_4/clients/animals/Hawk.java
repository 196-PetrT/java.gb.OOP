package Sem_4.clients.animals;

import Sem_4.clients.Illness;
import Sem_4.clients.Owner;

import java.time.LocalDate;

public class Hawk extends Animal implements Flyable, Goable {
    public Hawk(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Hawk() {
        super();
    }

    @Override
    public void eat() {
        System.out.println("Ястреб поймал дичь и ест");
    }

    @Override
    public void toFly() {
        System.out.println(nickName + " полетел куда-то");
    }

    @Override
    public double getFlySpeed() {
        return 15;
    }

    @Override
    public void toGo() {
        System.out.println(nickName + " сел на землю и крадется");
    }

    @Override
    public double getRunSpeed() {
        return 4;
    }


    }

