package ru.sectorsj.interview_preparation.hw2.task1_arraylist_demo;

import java.util.Iterator;

public class ArrayIterator<E> implements Iterator<E> {

    private int index = 0;
    private E[] values;

    ArrayIterator(E[] values) {
        this.values = values;
    }

    @Override
    public boolean hasNext() {
        return index < values.length;
    }

    @Override
    public E next() {
        return values [index++];
    }
}
