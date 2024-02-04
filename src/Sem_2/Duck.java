import java.time.LocalDate;
public class Duck extends Animal{
    public Duck (String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }
    public Duck(){
        super();
    }
    public void go() {
        System.out.println(nickName + ": плаваю я лучше, чем гуляю..");
    }
    @Override
    public void eat() {
        System.out.println("Утка ест");
    }
}
