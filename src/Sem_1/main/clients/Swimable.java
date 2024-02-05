package Sem_1.main.clients;

public interface Swimable {
    void swim();
    default double getSwimSpeed(){
        return 10;
    }
}
