package Sem_4.clients.animals;

import Sem_4.clients.Illness;
import Sem_4.clients.Owner;

import java.time.LocalDate;

public class Cock extends Animal implements Goable, Flyable {
    public Cock(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Cock() {
        super();
    }

    @Override
    public void eat() {
        System.out.println("Петуху насыпали пшена и он не спеша клюет");
    }

    @Override
    public void toFly() {
        System.out.println(nickName + " летает крайне сомнительно");
    }

    @Override
    public double getFlySpeed() {
        return 2;
    }

    @Override
    public void toGo() {
        System.out.println(nickName+ " побежал куда-то");
    }

    @Override
    public double getRunSpeed() {
        return 8;
    }


}
