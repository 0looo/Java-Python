
public class Ex06 {
	static int num1 = 3;
	static int num2 = 4;
	static int radius = 3;
	static double pi = 3.14;
	
	public static void main(String[] args) {
		rangleArea();
		add();
		

	}

	// 4. 매개변수 X, 반환값 X
	public static void rangleArea() {
		System.out.println(num1 * num2);
	}
	
	public static void add() {
		int result = num1 + num2;
		System.out.println(result);
	}
}
