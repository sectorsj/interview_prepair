package ru.sectorsj.interview_preparation.hw2.task1_arraylist_demo;

public class SimpleArrayRunner {

    public static void main(String[] args) {
//        Simple<String> strings = new SimpleArray<>();
        Simple<String> strings = init();

        for (String s : strings) {
            System.out.println(s);
        }

        System.out.println();

        testMyArrayList(strings);
    }

    private static Simple<String> init() {
        Simple<String> strings = new SimpleArray<>();
        strings.add("first");
        strings.add("second");
        strings.add("third");
        strings.add("forth");
        return strings;
    }

    private static void testMyArrayList(Simple<String> strings) {
        System.out.println(strings.get(1));
        strings.update(1,"second is updated");
        System.out.println(strings.get(1));
        System.out.println("всего элементов: " + (strings.size()));

        strings.delete(1);
        System.out.println("всего элементов: " + (strings.size()));
        System.out.println(strings.get(1));
    }
}
