package ru.sectorsj.interview_preparation.classworks.lesson1.patterns.example_5_proxy;

public class MainRunner5 {
	public static void main(String[] args) {
		CarProxy5 carProxy5 = new CarProxy5(new Car5(), true);
		carProxy5.speedUp();
		carProxy5.speedDown();
		
		System.out.println(carProxy5);
	}
}
