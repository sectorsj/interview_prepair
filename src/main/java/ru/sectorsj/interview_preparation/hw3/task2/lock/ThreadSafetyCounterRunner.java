package ru.sectorsj.interview_preparation.hw3.task2.lock;


public class ThreadSafetyCounterRunner {

	public static void main(String[] args) throws InterruptedException {
		Counter counter1 = new Counter(2000);
		Counter counter2 = new Counter(2000);
		for (int i = 0; i < 10; i++) {
			ThreadSafetyCounter tsc1 = new ThreadSafetyCounter(counter1, counter2);
			ThreadSafetyCounter tsc2 = new ThreadSafetyCounter(counter2, counter1);
			
			tsc1.start();
			tsc2.start();
			
			tsc1.join();
			tsc2.join();
			
			System.out.println(counter1);
			System.out.println(counter2);
		}
	}
}
