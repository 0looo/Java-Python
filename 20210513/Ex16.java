
public class Ex16 {

	public static void main(String[] args) {
		Ex15 ex15 = new Ex15("Jeck", 22, 122.5);
		System.out.println(ex15.getAge());
		System.out.println(ex15.getHeight());
		System.out.println(ex15.getName());
		
		ex15.setAge(30);
		ex15.setHeight(120.2);
		System.out.println(ex15.getAge());
		System.out.println(ex15.getHeight());
		System.out.println(ex15.getName());
	}

}
