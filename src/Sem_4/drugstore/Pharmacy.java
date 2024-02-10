package Sem_4.drugstore;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Pharmacy implements Iterable<Component>, Comparable<Pharmacy> {
    private List<Component> components = new ArrayList<>();
    private int index;


    public void addComponents(Component... components) {
        for (Component c : components) {
            this.components.add(c);
        }
    }

    @Override
    public Iterator<Component> iterator() {
        return new Iterator<Component>() {
            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public Component next() {
                return components.get(index++);
            }
        };

    }
    public int powerSum(){
        int sum = 0;
        for(Component c: this.components){
            sum += c.power;
        }
        return sum;
    }
    public int getWeight(){
        int weight = 0;
        for(Component c: this.components){
            weight += c.weight;
        }
        return weight;
    }

    @Override
    public int compareTo(Pharmacy o) {
        if (o.powerSum() != 0) {
            return Integer.compare(this.powerSum(), o.powerSum());
        } else if (o.getWeight() != 0) {
            return Integer.compare(this.getWeight(),o.getWeight());
        }
        return 0;
    }
        @Override
    public String toString() {
        return String.format("[Power = %s, Ves = %s]", powerSum(), getWeight());
    }
}
