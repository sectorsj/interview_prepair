package ru.sectorsj.interview_preparation.hw1.lesson.oop.example_9_access_to_private_fields;

import java.lang.reflect.Field;

class Person9 {

    private String name;
    private int age;

}

class Runner9 {
    public static void main(String[] args)throws InterruptedException, IllegalArgumentException,IllegalAccessException, NoSuchFieldException {
        Person9 p = new Person9();
        Field name = p.getClass().getDeclaredField("name");
        name.setAccessible(true);
        name.set(p, "Artem");
    }
}
