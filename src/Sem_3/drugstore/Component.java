package Sem_3.drugstore;

public abstract class Component implements Comparable<Component>{
    private final String title;

    private final Double weight;

    private final int power;

    public Double getMlWeight() {  // чтобы не кастовать

        return weight*1000;
    }

    public Component(String title, Double weight, int power) {
        this.title = title;
        this.weight = weight;
        this.power = power;


    }

    @Override
    public String toString() {
        return String.format("title = %s, power = %s", title, power);
    }

    @Override
    public int compareTo(Component o) {
//        return (int)(this.power - o.power);
        return Integer.compare(this.power, o.power); // для сортировки по возрастанию
        //
//        return Integer.compare(o.power, this.power); // по убыванию
//        if (this.power > o.power) return 1;
//        else if (this.power < o.power) return -1;
//        else return 0;
    }
}
