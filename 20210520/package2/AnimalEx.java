package package2;

public class AnimalEx {
	public static void main(String [] args) {
		Animal a1 = new Cat("포유류");
		Animal a2 = new Dog("포유류");
		
		Animal [] animals= new Animal[2];
		
		animals[0] = new Cat("포유류");
		animals[1] = new Dog("포유류");
		animals[0].sound();
		animals[1].sound();
	}
	
			
}
