package package1;

public class CarEx {

	public static void main(String[] args) {
		Car car = new Car();
		car.run();
		
		car.backLeftTire = new KumhoTire();
		car.backRightTire = new HankookTire();
		
		car.run();
		
		car.backLeftTire = new HankookTire();
		car.run();
		
	}

}