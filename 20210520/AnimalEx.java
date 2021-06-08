
public class AnimalEx {
	public static void main(String[] args) {
		Dog dog = new Dog("포유류");
		Cat cat = new Cat("포유류");
		dog.breathe();
		cat.breathe();
		dog.sound();
		cat.sound();
		
		// 다형성
		Animal animal = null;
		animal = new Dog("포유류");
		animal.breathe();
		animal.sound();
		
		test(1);
		test(2);
		test(3);
		
		animal = new Cat("포유류");
		animal.breathe();
		animal.sound();
		
		animalSound(new Cat("포유류"));
		animalSound(new Dog("포유류"));
		
	}
							// 매개변수의 다형성
							// Animal animal = new Cat();
							// Animal animal = new Dog();
	public static void animalSound(Animal animal) {
		System.out.println("animalSound메서드 실행");
		animal.sound();
	}
	public static void test(int i) { // int i = 1
		System.out.println(i);
	}
}
