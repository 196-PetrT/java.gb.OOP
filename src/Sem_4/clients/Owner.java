package Sem_4.clients;

public class Owner {
    String fullName;

    public Owner(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return String.format("%s", fullName);
    }
}
