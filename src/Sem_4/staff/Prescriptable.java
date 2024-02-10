package Sem_4.staff;


import Sem_4.clients.Illness;
import Sem_4.clients.animals.Animal;

public interface Prescriptable {
    void prescription(Animal animal, Illness illness);
}
