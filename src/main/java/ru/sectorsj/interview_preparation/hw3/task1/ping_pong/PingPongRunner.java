package ru.sectorsj.interview_preparation.hw3.task1.ping_pong;

public class PingPongRunner {
	public static void main(String[] args) {

		Object LOCK_OBJECT = new Object();
		Thread ping = new Thread(new PingPong(LOCK_OBJECT, "Ping"));
		Thread pong = new Thread(new PingPong(LOCK_OBJECT, "Pong"));
		ping.start();
		pong.start();
	}
}
