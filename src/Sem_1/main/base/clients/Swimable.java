package Sem_1.main.base.clients;


public interface Swimable {

    void swim();
    default double getSwimSpeed() {
        return 10;
    }
}
