package Sem_4.clients.animals;

import Sem_4.clients.Illness;
import Sem_4.clients.Owner;

import java.time.LocalDate;

public class Dog extends Animal implements Goable, Swimable {
    public Dog(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Dog() {
        super();
    }

    @Override
    public void eat() {
        System.out.println(nickName + " грызет кость");
    }

    @Override
    public void toGo() {
        System.out.println(nickName + " куда-то побежала");
    }

    @Override
    public double getRunSpeed() {
        return 15;
    }

    @Override
    public void toSwim() {
        System.out.println(nickName + " купается");
    }

    @Override
    public double getSwimSpeed() {
        return 5;
    }

}

