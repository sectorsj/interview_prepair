package ru.sectorsj.interview_preparation.classworks.lesson2;

public class ThreadSafetyCounter extends Thread {
	private Counter counter;
	
	public ThreadSafetyCounter(Counter counter) {
		this.counter = counter;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			counter.increaseCounter();
		}
	}
}
