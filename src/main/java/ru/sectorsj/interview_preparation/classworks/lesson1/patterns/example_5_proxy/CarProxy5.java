package ru.sectorsj.interview_preparation.classworks.lesson1.patterns.example_5_proxy;

public class CarProxy5 {
	Car5 car5;
	boolean haveLicence;
	
	public CarProxy5(Car5 car5, boolean haveLicence) {
		this.car5 = car5;
		this.haveLicence = haveLicence;
	}
	
	public void speedUp() {
		if (haveLicence) {
			car5.speedUp();
		}
	}
	
	public void speedDown() {
		if (haveLicence) {
			car5.speedDown();
		}
	}
}
