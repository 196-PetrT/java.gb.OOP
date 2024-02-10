package Sem_4.clients;

public class Illness {
    String title;

    public Illness(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return String.format("%s", title);
    }
}
