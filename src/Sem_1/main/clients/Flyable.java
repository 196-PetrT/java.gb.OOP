package Sem_1.main.clients;

public interface Flyable {
    void fly();
    default double getFlySpeed(){
        return 10;
    }
}
