package Sem_1.main.base.clients;

public interface Flyable {

    void fly();
    default double getFlySpeed(){
        return 10;
    }
}
