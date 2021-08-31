package ru.sectorsj.interview_preparation.classworks.lesson2;


public class ThreadSafetyCounterRunner {
	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();
		for (int i = 0; i < 200; i++) {
			ThreadSafetyCounter tsc = new ThreadSafetyCounter(counter);
		}
	}
}
