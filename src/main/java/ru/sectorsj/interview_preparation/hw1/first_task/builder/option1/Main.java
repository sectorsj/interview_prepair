package ru.sectorsj.interview_preparation.hw1.first_task.builder.option1;

public class Main {
	public static void main(String[] args) {
		Director director = new Director();
		
		director.setBuilder(new Manager());
		Person person = director.buildPerson();
		System.out.println(person);
		
		director.setBuilder(new Employee());
		Person person1 = director.buildPerson();
		System.out.println(person1);
		
		
	}
}
