package ru.sectorsj.interview_preparation.classworks.lesson1.patterns.example_4_builder;

public class Main4 {
	public static void main(String[] args) {
		Car4 car4 = new Car4.Builder()
				.addEngine(new Engine4())
				.addTransmission(new Transmission4())
				.addBody(new Body4() )
				.addBrakes(new Brakes4())
				.addPedals(new Pedals4())
				.addWindscreenWipes(new WindscreenWipers4())
				.addWeels(new Wheels4())
				.addRadio(new Radio4())
				.addSeats(new Seats4())
				.addBelts(new Belts4())
				.addClimateControle(new ClimateControle4())
				.build();
		System.out.println(car4);
	}
}
