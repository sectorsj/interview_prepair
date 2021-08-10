package ru.sectorsj.interview_preparation.hw3.task2.lock;

public class ThreadSafetyCounter extends Thread {
	private Counter first;
	private Counter second;
	
	public ThreadSafetyCounter(Counter first, Counter second) {
		this.first = first;
		this.second = second;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			lockCounter();
			try {
				first.increaseCounter(5);
				second.increaseCounter(5);
			} finally {
				first.getLock().unlock();
				second.getLock().unlock();
			}
		}
	}
	
	private void lockCounter() {
		while (true) {
			boolean fistLockResult = first.getLock().tryLock();
			boolean secondLockResult = second.getLock().tryLock();
			if (fistLockResult && secondLockResult) {
				break;
			}
			if (fistLockResult) {
				first.getLock().unlock();
			}
			if (secondLockResult) {
				second.getLock().unlock();
			}
		}
	}
}
