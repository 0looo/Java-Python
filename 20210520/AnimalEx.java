
public class AnimalEx {
	public static void main(String[] args) {
		Dog dog = new Dog("������");
		Cat cat = new Cat("������");
		dog.breathe();
		cat.breathe();
		dog.sound();
		cat.sound();
		
		// ������
		Animal animal = null;
		animal = new Dog("������");
		animal.breathe();
		animal.sound();
		
		test(1);
		test(2);
		test(3);
		
		animal = new Cat("������");
		animal.breathe();
		animal.sound();
		
		animalSound(new Cat("������"));
		animalSound(new Dog("������"));
		
	}
							// �Ű������� ������
							// Animal animal = new Cat();
							// Animal animal = new Dog();
	public static void animalSound(Animal animal) {
		System.out.println("animalSound�޼��� ����");
		animal.sound();
	}
	public static void test(int i) { // int i = 1
		System.out.println(i);
	}
}
