package Sem_4.drugstore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PharmacyTwo implements Iterable<Component>, Comparable<PharmacyTwo> {
    private List<Component> components = new ArrayList<>();

    private int index;




    public void addComponents(Component ... components){
        for(Component c : components){
            this.components.add(c);
        }
    }

    public int getWeight(){
        int weight = 0;
        for(Component c: this.components){
            weight += c.weight;
        }
        return weight;
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

    @Override
    public int compareTo(PharmacyTwo o) {
        return Integer.compare(this.getWeight(), o.getWeight());
    }

    @Override
    public String toString() {
        return String.format("Ves = %s", getWeight());
    }
}
