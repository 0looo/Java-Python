package package7;

public class Car {
	// ������
	
	Tire frontLeftTire =  new HankookTire();
	Tire frontRightTire = new KumhoTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new KumhoTire();
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
