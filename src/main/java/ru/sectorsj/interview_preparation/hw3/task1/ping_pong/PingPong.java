package ru.sectorsj.interview_preparation.hw3.task1.ping_pong;

class PingPong implements Runnable{
	private Object LOCK_OBJECT;
	private String name;
	
	public PingPong(Object LOCK_OBJECT, String name) {
		this.LOCK_OBJECT = LOCK_OBJECT;
		this.name = name;
	}
	
	@Override
	public void run() {
		synchronized (LOCK_OBJECT) {
			while(true) {
				System.out.println(name);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				LOCK_OBJECT.notify();
				
				try {
					LOCK_OBJECT.wait(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
