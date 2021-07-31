package ru.sectorsj.interview_preparation.hw1.lesson.oop.example4;

class Manager4 extends Person4{
	
	private String post;
	
	static {
		System.out.println("Выполнение статического блока инициализации Manager4");
	}
	
	{
		System.out.println("Выполнение блока инициализации Manager4");
	}
	
	public Manager4(String name, int age) {
		super(name, age);
		System.out.println("Конструктор Manager4");
	}
}
