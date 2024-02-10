package Sem_4.listGB.core.impl;

import Sem_4.listGB.core.util.ArrayIterator;
import Sem_4.listGB.core.GBList;

import java.util.Iterator;

public class GBArrayList<T> implements GBList<T> {
    private int size;

    private  T[] values;

    private int capacity;

    @SuppressWarnings("unchecked")
    public GBArrayList() {
        this.size = 0;
        this.capacity = 2;
        this.values = (T[]) new Object[capacity];
        // по правильному нужно сделать исключение
//        try {
//            this.values = (T[]) new Object[capacity];
//        } catch (ClassCastException e) {
//            e.printStackTrace();
//        }


    }

    @SuppressWarnings("unchecked")
    private void addCapacity() {
        try {
            capacity = capacity*2; // обновили во всем классе
            T[] temp = (T[]) new Object[capacity];
            System.arraycopy(values, 0, temp, 0, values.length);
            values = temp;
        } catch (ClassCastException e) {
            e.printStackTrace();}
    }

    @Override
    public void add(T elem) {
        if (size == capacity){
            addCapacity();
        }
        values[size++] = elem;
    }

    @Override
    public void remove(int index) {
//       todo сделать в try catch
        capacity = capacity -1;
        T[] temp = (T[]) new Object[capacity];
        System.arraycopy(values, 0, temp, 0, index);
        int amountElementsAfterIndex = values.length - index - 1;
        System.arraycopy(values, index + 1, temp, index, amountElementsAfterIndex);
        values = temp;
        size--;
    }

    @Override
    public T get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator iterator() {

        return new ArrayIterator<>(values);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        int index = 0;
        while (index != size) {
            builder.append(values[index]).append(", ");
            index++;
        }
        if (builder.length() == 1)
            return "[]";
        builder.deleteCharAt(builder.length() - 1).deleteCharAt(builder.length() - 1);
        builder.append("]");
        return builder.toString();
    }
}
