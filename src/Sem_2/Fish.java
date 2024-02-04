import java.time.LocalDate;

public class Fish extends Animal {
    public Fish (String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }
    public Fish (){
        super();
    }
    public void go() {
        System.out.println(nickName + ": не умею=(");
    }

    public void fly() {
        System.out.println(nickName + ": хотелось бы, но нет]");
    }
    @Override
    public void eat() {
        System.out.println("Рыба ест");
    }
}
