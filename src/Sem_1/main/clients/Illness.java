package Sem_1.main.clients;

public class Illness {
    String title;

    public Illness(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return String.format(title);
    }
}
