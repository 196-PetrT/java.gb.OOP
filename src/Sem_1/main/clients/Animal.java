package Sem_1.main.clients;

import java.time.LocalDate;

public class Animal {
    public Double discount;
    protected String nickname;
    protected Owner owner;
    protected LocalDate birthDate;
    protected Illness illness;

    public Animal(String nickname, Owner owner, LocalDate birthDate,
                  Illness illness) {
        this.nickname = nickname;
        this.owner = owner;
        this.birthDate = birthDate;
        this.illness = illness;


    }

    public Animal() {
//        this.nickname = "Кличка";
//        this.owner = new Owner("A");
//        this.birthDate = LocalDate.now();
//        this.illness = new Illness("болеет");
        this("Кличка", new Owner("Владелец"), LocalDate.now(),
                new Illness("здоров"));

    }

    public String getNickname() {
        return nickname;
    }

    public Owner getOwner() {
        return owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Illness getIllness() {
        return illness;
    }

    public void setIllness(Illness illness) {
        this.illness = illness;
//        int x = 13; // сотрется по завершению метода
    }

    public void lifeCycle(){
        wakeUp("12/00");
        hunt();
        eat();
        sleep();
    }

    public void skills(){
        toGo();
        fly();
        swim();
    }



    private void wakeUp() {
        System.out.println("wake up");
    }

    private void wakeUp(String time) {
        System.out.println(nickname + "wake up to " + time); // пример перегрузки - полиморфизм
// или
//      wakeUp("12/00"); // та-же перегрузка
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
        System.out.println(nickname + " is moving!");
    }

    public void fly(){
        System.out.println(nickname + " is flying!");
    }

    public void swim(){
        System.out.println(nickname + " is swimming!");
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
