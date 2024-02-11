package Sem_4.listGB.core.impl;

import Sem_4.listGB.core.GBLList;
import Sem_4.listGB.core.GBList;
import Sem_4.listGB.core.util.LinkedIterator;
import java.util.Iterator;

public class GBLinkedList<T> implements GBList<T>, GBLList<T> {
    private int size = 0;
    private Node<T> first;
    private Node<T> last;

    private static class Node<T> {
        T item;
        Node<T> next;
        Node<T> prev;
        Node(Node<T> prev, T elem, Node<T> next){
            this.item = elem;
            this.next = next;
            this.prev = prev;
        }

    }

    public GBLinkedList() {
        first = null;
        last = null;
    }

    @Override
    public void addFirst(T elem) {
        Node<T> f = first;
        Node<T> temp = new Node<>(null, elem, f);
        first = temp;
        if (f == null)
            last = temp;
        else
            f.prev = temp;

        size++;
    }

    @Override
    public void add(T elem) {
        Node<T> l = last;
        Node<T> temp = new Node<>(l, elem, null);
        last = temp;
        if (l == null)
            first = temp;
        else
            l.next = temp;
        size++;
    }

    @Override
    public void remove(int index) {
        System.out.println("Пока не умею!");
    }

    @Override
    public T get(int index) {
        if (index < 0 || index > size())
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size());
        else {
            Node<T> x = first;
                for (int i = 0; i < index; i++)
                    x = x.next;
                return x.item;
            }
    }



    @Override
    public int size() {
        return size;
    }


    @Override
    public Iterator<T> iterator() {
        return new LinkedIterator<>();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        Node<T> x = first;

        for (int i = size-1; i >= 0; i--) {

            builder.append(x.item).append(", ");
            x = x.next;
        }
        if (builder.length() == 1)
            return "[]";
        builder.deleteCharAt(builder.length() - 1).deleteCharAt(builder.length() - 1);
        builder.append("]");
        return builder.toString();
    }
}
