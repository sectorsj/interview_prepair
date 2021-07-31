package ru.sectorsj.interview_preparation.hw1.lesson.oop.example3;

public class InstanceOfDemo {
	
	public static void main(String[] args) {
		Integer a = 1;
		String b = "Hello!";
		
		if (a instanceof Integer) {
			System.out.println("a is Integer");
		}
		if (b instanceof String) {
			System.out.println("b is String");
		}
	}
}
