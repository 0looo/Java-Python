package package2;

public class AnimalEx {
	public static void main(String [] args) {
		Animal a1 = new Cat("������");
		Animal a2 = new Dog("������");
		
		Animal [] animals= new Animal[2];
		
		animals[0] = new Cat("������");
		animals[1] = new Dog("������");
		animals[0].sound();
		animals[1].sound();
	}
	
			
}
