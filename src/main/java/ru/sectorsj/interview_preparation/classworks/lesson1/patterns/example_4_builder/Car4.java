package ru.sectorsj.interview_preparation.classworks.lesson1.patterns.example_4_builder;

public class Car4 {
	private Engine4 engine4;
	private Transmission4 transmission4;
	private Body4 body4;
	private Brakes4 brakes4;
	private Pedals4 pedals4;
	private WindscreenWipers4 windscreenWipers4;
	private Wheels4 wheels4;
	private Radio4 radio4;
	private Seats4 seats4;
	private Belts4 belts4;
	private ClimateControle4 climateControle4;
	
	@Override
	public String toString() {
		return "Car4{" +
				"engine4=" + engine4 +
				", transmission4=" + transmission4 +
				", body4=" + body4 +
				", brakes4=" + brakes4 +
				", pedals4=" + pedals4 +
				", windscreenWipers4=" + windscreenWipers4 +
				", wheels4=" + wheels4 +
				", radio4=" + radio4 +
				", seats4=" + seats4 +
				", belts4=" + belts4 +
				", climateControle4=" + climateControle4 +
				'}';
	}
	
	public static class Builder {
		private Engine4 engine4;
		private Transmission4 transmission4;
		private Body4 body4;
		private Brakes4 brakes4;
		private Pedals4 pedals4;
		private WindscreenWipers4 windscreenWipers4;
		private Wheels4 wheels4;
		private Radio4 radio4;
		private Belts4 belts4;
		private Seats4 seats4;
		private ClimateControle4 climateControle4;
		
		public Builder addEngine(Engine4 engine4) {
			this.engine4 = engine4;
			return this;
		}
		
		public Builder addTransmission(Transmission4 transmission4) {
			this.transmission4 = transmission4;
			return this;
		}
		
		public Builder addBody(Body4 body4) {
			this.body4 = body4;
			return this;
		}
		
		public Builder addBrakes(Brakes4 brakes4) {
			this.brakes4 = brakes4;
			return this;
		}
		
		public Builder addPedals(Pedals4 pedals4) {
			this.pedals4 = pedals4;
			return this;
		}
		
		public Builder addWindscreenWipes(WindscreenWipers4 windscreenWipers4) {
			this.windscreenWipers4 = windscreenWipers4;
			return this;
		}
		
		public Builder addWeels(Wheels4 wheels4) {
			this.wheels4 = wheels4;
			return this;
		}
		
		public Builder addRadio(Radio4 radio4) {
			this.radio4 = radio4;
			return this;
		}
		
		public Builder addSeats(Seats4 seats4) {
			this.seats4 = seats4;
			return this;
		}
		
		public Builder addBelts(Belts4 belts4) {
			this.belts4 = belts4;
			return this;
		}
		
		public Builder addClimateControle(ClimateControle4 climateControle4) {
			this.climateControle4 = climateControle4;
			return this;
		}
		
		public Car4 build() {
			return new Car4();
		}
	}
}
