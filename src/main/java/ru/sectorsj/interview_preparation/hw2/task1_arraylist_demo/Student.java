package ru.sectorsj.interview_preparation.hw2.task1_arraylist_demo;

public class Student {
	private String name;
	
	public Student(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "студент {" + "name = '" + name + '\'' + '}';
	}
}
