package package1;

public class Car {
	Tire frontLeftTire = new Tire();
	Tire frontRightTire  = new Tire();
	Tire backLeftTire = new Tire();
	Tire backRightTire = new Tire();
	
	public void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
