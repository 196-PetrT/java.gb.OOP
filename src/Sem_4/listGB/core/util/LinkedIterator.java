package Sem_4.listGB.core.util;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedIterator<E> implements Iterator<E>{
    private int size;
    private Node<E> lastReturned;
    private Node<E> next;
    private int nextIndex;

    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;
        Node(Node<E> prev, E item, Node<E> next){
            this.item = item;
            this.next = next;
            this.prev = prev;
        }

    }

    public LinkedIterator() {
    }

    @Override
    public boolean hasNext() {
        return nextIndex < size;
    }

    @Override
    public E next() {
        if (!hasNext())
            throw new NoSuchElementException();

        lastReturned = next;
        next = next.next;
        nextIndex++;
        return lastReturned.item;
    }
}
