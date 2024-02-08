package Sem_1.main.base.clients;

public interface Goable {

    void toGo();
    default double getGoSpeed(){
        return 10;
    }

}
