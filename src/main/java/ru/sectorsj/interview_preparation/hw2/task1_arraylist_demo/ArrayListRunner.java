package ru.sectorsj.interview_preparation.hw2.task1_arraylist_demo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRunner {
	static ArrayList<String> myList = new ArrayList<>();
	
	public static void main(String[] args) {
		arrayListWithObjects();
		
		init();
		printAll(myList);
		theSize(myList);
		removeSecondIndex(myList);
		theSize(myList);
	}
	
	private static void arrayListWithObjects () {
		List<Student> studentList = new ArrayList<>();
		
		Student student = new Student("Ivan");
		Student student1 = new Student("Vasya");
		Student student2 = new Student("Artem");
		studentList.add(student);
		studentList.add(student1);
		studentList.add(student2);
		
		int theSize = studentList.size();
		System.out.println("сколько студентов в списке? " + theSize);
		
		boolean isIn = studentList.contains(student);
		System.out.println("есть ли Ivan в списке студентов? " + isIn);
		
		int idx = studentList.indexOf(student1);
		System.out.println("какой у " + studentList.get(1) + " индекс? " + idx);
		
		boolean empty = studentList.isEmpty();
		System.out.println("пустой ли список со студентами? ответ: " + empty);
		
		studentList.remove(student2);
		System.out.println(student2 + " был удален из списка");
		
		int newSize = studentList.size();
		System.out.println("сколько теперь студентов в списке = " + newSize);
		
		Student getListPosition = studentList.get(1);
		System.out.println("мы узнали студента под индексом 1, это " + getListPosition);
		System.out.println("");
	}
	
	
	
	private static void init() {
		myList.add(0,"ноль");
		myList.add(1,"один");
		myList.add(2,"два");
		myList.add(3,"три");
		myList.add(4,"четыре");
	}
	
	private static void printAll(ArrayList<String> myList) {
			for (String element : myList) {
				System.out.print(element + " ");
			}
		System.out.println(" ");
	}
	
	private static void theSize(ArrayList<String> myList) {
		int s = myList.size();
		System.out.println("размер arrayList - " + s + " элементов");
	}
	
	private static void removeSecondIndex(ArrayList<String> myList) {
		myList.remove(1);
		for (String element : myList) {
			System.out.print(element + " ");
		}
		System.out.println(" ");
	}
	
	private static void whereIndexIs(ArrayList<String> myList) {
	
	}
	
}
