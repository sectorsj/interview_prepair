package ru.sectorsj.interview_preparation.classworks.lesson1.oop.example3;

public class InstanceOfDemo2 {
	public static void main(String[] args) {
		checkInt();
		checkString();
	}
	public static void checkInt() {
		Integer num = 1;
		
		if (num instanceof Number) {
			System.out.println(true);
		}
	}
	
	public static void checkString() {
		String str = null;
		
		if (str instanceof String) {
			System.out.println(true);
		}
	}
}
