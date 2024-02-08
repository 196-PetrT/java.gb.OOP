package Sem_1.main.base.medPersonal;

public class Office {
    String title;

    public Office(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return String.format(title);
    }
}
