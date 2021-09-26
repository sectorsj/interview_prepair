package ru.sectorsj.interview_preparation.hw3.task2.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {

	private static int generator = 1;
	private final Lock lock = new ReentrantLock();
	private int id;
	private int counter;
	
	
	public Counter(int counter) {
		this.counter = counter;
		this.id = generator++;
	}
	
	public void increaseCounter(int counter) {
		this.counter += counter;
	}
	
	public Lock getLock() {
		return lock;
	}
	
	@Override
	public String toString() {
		return "Counter{" +
				"id=" + id +
				", counter=" + counter +
				'}';
	}
}
