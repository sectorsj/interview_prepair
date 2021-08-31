package ru.sectorsj.interview_preparation.classworks.lesson2;

public class Counter {
	
	
	private long counter = 0L;
	
	public synchronized void increaseCounter() {
		counter++;
	}
	
	public long getCounter() {
		return counter;
	}
}
