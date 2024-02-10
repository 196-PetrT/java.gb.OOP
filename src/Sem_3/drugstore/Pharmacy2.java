package Sem_3.drugstore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public  class Pharmacy2 implements Iterable<Component>, Comparable<Pharmacy2>, CompareToable {
    private List<Component> components = new ArrayList<>();
    private List<Pharmacy2> pharmacys = new ArrayList<>();
    private int index = 0;
    private int ComponentsWeight0 = 0;
    private int ComponentsWeight1 = 0;

    public void addCompanents(Component... components) {
        for (Component c : components) {
            this.components.add(c);
        }
    }
//

    public Pharmacy2() {
        this.pharmacys = pharmacys;
    }


    private int getComponentsPower() {
        int result = 0;
        for (Component component : this.components) {
            result += component.getMlWeight();
        }
        return result;
    }
//    @Override
//    public boolean hasNext() {
//        return index < components.size();
//    }
//
//    @Override
//    public Component next() {
//        return components.get(index++);
//    }

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
    public int compareTo(Pharmacy2 o) {
        int result;  // по возрастанию
        for (Component c : o.components) {
            ComponentsWeight0 += c.getMlWeight();
        }
        for (Component c : this.components) {
            ComponentsWeight1 += c.getMlWeight();
        }
//        return Integer.compare(this.components, o.components); // пишет нельзя так

        // правильное через Integer.compare
        return Integer.compare(ComponentsWeight1, ComponentsWeight0);
//        if (ComponentsWeight0 > ComponentsWeight1) {
//            result =  -1;
//        } else if (ComponentsWeight0 < ComponentsWeight1) {
//            result =  1;
//        } else {
//            result =  0;
//        }
//        return  result;
    }


    @Override
    public String toString() {
        return String.format("size = %s, result = %s", components.size(), this.getComponentsPower());
    }


}
