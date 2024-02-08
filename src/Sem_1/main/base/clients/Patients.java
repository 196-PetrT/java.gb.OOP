package Sem_1.main.base.clients;

import java.time.LocalDate;

public abstract class Patients {
    public Double discount;
    protected String nickname;
    protected Owner owner;
    protected LocalDate birthDate;
    protected Illness illness;
    public double distance;

    public Patients(String nickname, Owner owner, LocalDate birthDate,
                  Illness illness) {
        this.nickname = nickname;
        this.owner = owner;
        this.birthDate = birthDate;
        this.illness = illness;
    }

    public Patients() {

    }

    private void wakeUp(String time) {
        System.out.println(nickname + "wake up to " + time); // пример перегрузки - полиморфизм
    }

    private void hunt() {
        System.out.println(nickname + "hunt");
    }

    private void eat() {
        System.out.println(nickname + "eat");
    }

    private void sleep() {
        System.out.println(nickname + "sleep");
    }

    public void toGo(){
        System.out.println(nickname + " прошел за сегодня: ");

    }

    public void fly(){
        System.out.println(nickname + " пролетел за сегодня: ");

    }

    public void swim(){
        System.out.println(nickname + " проплыл за сегодня: ");

    }

    public String getType(){
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return String.format("nickName = %s, bd = %s, owner = %s," +
                " illness = %s", nickname, birthDate, owner, illness);
    }
}
