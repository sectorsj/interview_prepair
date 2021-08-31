package ru.sectorsj.interview_preparation.classworks.lesson1.oop.example4;

public class Person4 {
	private String name;
	private int age;
	
	static {
		System.out.println("Выполнение статического блока инициализации Person4");
	}
	
	{
		System.out.println("Выполнение блока инициализации Person4");
	}
	
	public Person4(String name, int age) {
		System.out.println("Выполнение конструктора Person4");
		this.name = name;
		this.age = age;
	}
}
