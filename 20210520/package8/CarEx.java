package package8;

public class CarEx {

	public static void main(String[] args) {
		Car car = new Car();
		car.run();
		
		car.tires[0] = new KumhoTire();
		car.tires[1] = new KumhoTire();
		
		car.run();

	}

}
