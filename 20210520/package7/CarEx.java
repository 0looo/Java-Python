package package7;

public class CarEx {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();
		
		// ´ÙÇü¼º
		myCar.backLeftTire = new KumhoTire();
		myCar.backRightTire= new HankookTire();
		
		myCar.run();
	}

}
