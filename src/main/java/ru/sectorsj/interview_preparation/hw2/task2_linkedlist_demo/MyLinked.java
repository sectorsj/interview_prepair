package ru.sectorsj.interview_preparation.hw2.task2_linkedlist_demo;

public interface MyLinked<E> {
    void addLast(E e);
    void addFirst(E e);
    int size();
    E getElementByIndex(int counter);
}
