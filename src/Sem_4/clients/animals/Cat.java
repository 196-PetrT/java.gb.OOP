package Sem_4.clients.animals;



import Sem_4.clients.Illness;
import Sem_4.clients.Owner;

import java.time.LocalDate;

public class Cat extends Animal implements Goable, Swimable {

    Double discount;

    public Cat(String nickName, Owner owner, LocalDate birthDate, Illness illness, Double discount) {
        super(nickName, owner, birthDate, illness);
        this.discount = discount;
    }

    public Cat() {
        super();
        this.discount = 10D;
    }


    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    @Override
    public void eat() {
        System.out.println(nickName + " поймала мышку и кушает");
    }

    @Override
    public void toGo() {
        System.out.println(nickName + " куда-то побежала");
    }

    @Override
    public double getRunSpeed() {
        return 9;
    }

    @Override
    public void toSwim() {
        System.out.println(nickName + " нехотя прыгает в воду и плывет за уткой");
    }

    @Override
    public double getSwimSpeed() {
        return 5;
    }



}

