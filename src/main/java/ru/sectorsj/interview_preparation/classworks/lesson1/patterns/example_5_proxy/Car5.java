package ru.sectorsj.interview_preparation.classworks.lesson1.patterns.example_5_proxy;

public class Car5 implements Movable5 {
	int speed;
	
	@Override
	public void speedUp() {
		while (speed < 50) {
			speed ++;
		}
	}
	
	@Override
	public void speedDown() {
		while (speed > 0) {
			speed--;
		}
	}
}
