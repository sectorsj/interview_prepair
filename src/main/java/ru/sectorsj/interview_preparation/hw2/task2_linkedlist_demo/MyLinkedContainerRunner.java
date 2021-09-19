package ru.sectorsj.interview_preparation.hw2.task2_linkedlist_demo;

import java.util.Iterator;

public class MyLinkedContainerRunner {

    public static void main(String[] args) {
        testMyLinked();

        // т.к. интерфейс MyLinked не реализует Iterable, по этому в нем нельзя итерироваться
        // приходится использовать реализацию MylinkedContainer.
        // добавление через addFirst() - в обратном порядке
        MyLinkedContainer<String> strings1 = initMyLinkedContainer();
        for (String s : strings1) {
            System.out.println(s);
        }
        System.out.println();


        // добавление через addLast() - в обычном порядке
        MyLinkedContainer<String> strings2 = initMyLinkedContainer2();
        for (String s : strings2) {
            System.out.println(s);
        }
        System.out.println();


        // добавление через addLast(), но с помощью descendingIterator()
        // метода Iterator полученного от Deque - добавление элементов идет снова в обратном порядке
        Iterator iterator = strings2.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static MyLinkedContainer<String> initMyLinkedContainer() {
        MyLinkedContainer<String> strings1 = new MyLinkedContainer<>();
        strings1.addFirst("addFirst1");
        strings1.addFirst("addFirst2");
        strings1.addFirst("addFirst3");
        return strings1;

    }

    private static MyLinkedContainer<String> initMyLinkedContainer2() {
        MyLinkedContainer<String> strings2 = new MyLinkedContainer<>();
        strings2.addLast("addLast1");
        strings2.addLast("addLast2");
        strings2.addLast("addLast3");
        return strings2;
    }

    private static void testMyLinked() {
        MyLinked<String> strings = initMyLinked();
        System.out.println(strings.size());
        System.out.println(strings.getElementByIndex(0));
        System.out.println();
    }

    private static MyLinked<String> initMyLinked() {
        MyLinked<String> strings = new MyLinkedContainer<>();
        strings.addFirst("abc");
        strings.addFirst("def");
        strings.addFirst("ghi");
        return strings;
    }
}
