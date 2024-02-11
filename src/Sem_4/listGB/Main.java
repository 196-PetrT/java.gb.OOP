package Sem_4.listGB;

import Sem_4.listGB.core.impl.GBLinkedList;


public class Main {

    public static void main(String[] args) {
//        GBList<Integer> list = new GBArrayList<>();
//
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        System.out.println(list);
//        list.remove(2);
//        System.out.println(list.size());

        GBLinkedList<Integer> list = new GBLinkedList<>();

        System.out.println(list);
        list.add(5);
        System.out.println(list);
        list.add(4);
        System.out.println(list);
        list.addFirst(3);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(1));



    }
}
