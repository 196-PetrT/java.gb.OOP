package Sem_1.main.clients;

public interface Goable {
    void toGo();
    default double getRunSpeed(){
        return 10;
    }

}
