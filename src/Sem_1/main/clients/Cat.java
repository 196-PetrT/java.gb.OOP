package Sem_1.main.clients;

import java.time.LocalDate;

// пример наследования, кошки чем-то отличаются)

public class Cat extends Animal implements Goable {

    public Cat(String nickname, Owner owner, LocalDate birthDate,
               Illness illness) {
        super(nickname, owner, birthDate, illness);
        this.discount = discount;
    }

    public Cat() {
        super();
        this.discount = 10D;

    }
    public static void meow(){
        System.out.println("Мяяу");
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return super.toString() + ", Discount(" + discount + ")";
    }

    @Override
    public void toGo() {
    }

    @Override
    public double getRunSpeed() {
        return Goable.super.getRunSpeed();
    }

}
