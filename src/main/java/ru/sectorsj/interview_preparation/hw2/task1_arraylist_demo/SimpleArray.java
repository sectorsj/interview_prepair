package ru.sectorsj.interview_preparation.hw2.task1_arraylist_demo;

import java.util.Iterator;

public class SimpleArray<E> implements Simple<E> {
    private E[] values;

    public SimpleArray() {
        values = (E[]) new Object[0];
    }

    @Override
    public boolean add(E e) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length - 1] = e;
            return true;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public void delete(int index) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, values, 0, index);

            int amountElementAfterIndex = temp.length - index - 1;

            System.arraycopy(
                    temp,                       // obj src
                    index + 1,            //position
                    values,                     // obj dest
                    index,                      // target
                    amountElementAfterIndex     // int length
            );
        }catch (ClassCastException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void update(int index, E e) {
        values[index] = e;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<>(values);
    }
}
