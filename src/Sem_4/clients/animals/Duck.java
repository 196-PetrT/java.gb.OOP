package Sem_4.clients.animals;

import Sem_4.clients.Illness;
import Sem_4.clients.Owner;

import java.time.LocalDate;

public class Duck extends Animal implements Swimable, Goable, Flyable {

    public Duck(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Duck() {
        super();
    }

    @Override
    public void eat() {
        System.out.println(nickName + " поймала лягушку и ест");
    }

    @Override
    public void toFly() {
        System.out.println(nickName + " полетела к озеру");
    }

    @Override
    public double getFlySpeed() {
        return 8;
    }

    @Override
    public void toGo() {
        System.out.println(nickName + " побежала");
    }

    @Override
    public double getRunSpeed() {
        return 4;
    }

    @Override
    public void toSwim() {
        System.out.println(nickName + " поплыла куда-то");
    }

    @Override
    public double getSwimSpeed() {
        return 10;
    }



    }

