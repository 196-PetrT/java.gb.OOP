package Sem_4.listGB;

import Sem_4.listGB.core.GBList;
import Sem_4.listGB.core.impl.GBArrayList;


public class ArrayListMain {

    public static void main(String[] args) {
        GBList<Integer> list = new GBArrayList<>();

        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        list.remove(2);
        System.out.println(list.size());
    }
}
