package ru.sectorsj.interview_preparation.hw1.lesson.oop.example1;

public class Person1 {
	private String name;
	private int age;
	
	public Person1(Person1 p) {
		this(p.name, p.age);
	}
	
	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
