package ru.sectorsj.interview_preparation.hw2.task2_linkedlist_demo;

import java.util.LinkedList;

public class LinledlistRunner {
	public static void main(String[] args) {
		
		LinkedList<Item> itemsList = new LinkedList<>();
		Item first = new Item("first");
		Item second = new Item("second");
		Item third = new Item("third");
		Item four = new Item("four");
		Item five = new Item("five");
		
		itemsList.add(first);
		itemsList.add(four);
		itemsList.add(third);
		System.out.println("Добро пожаловать в Double LinkedList!!!");
		System.out.println(itemsList);
		System.out.println("");
		
		itemsList.addFirst(second);
		itemsList.addLast(five);
		System.out.println(itemsList);
		System.out.println("");
		
		System.out.println(itemsList.peekFirst() + " - выбран этот элемент");
		System.out.println(itemsList.peekLast() + " - выбран этот элемент");
		System.out.println(itemsList);
		System.out.println("");
		
		System.out.println(itemsList.pollFirst() + " - удаляем из списка");
		System.out.println(itemsList);
	}
}
