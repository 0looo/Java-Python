package package8;

public class Car {
	// int i [] = {1,2,3,4,5}
	// Tire tire = new HankookTire();
	// �ɹ� �ʵ��� �迭
	
	Tire [] tires = {new HankookTire(), new HankookTire(),new HankookTire(),new HankookTire()};
	void run() {
		for(Tire tire : tires) {
			tire.roll();
		}
	}
	
}
