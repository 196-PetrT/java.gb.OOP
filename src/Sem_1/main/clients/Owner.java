package Sem_1.main.clients;

public class Owner {
    String fullName;

    public Owner(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return String.format(fullName);
    }
}
