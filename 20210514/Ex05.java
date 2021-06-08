
public class Ex05 {
	static int num1 = 10;
	static int num2 = 20;
	static int radius = 3;
	static double pi = 3.141592;
	
	public static void main(String[] args) {
		int result = rangleArea();
		System.out.println(result);
		
		double d = circleArea();
		System.out.println(d);
		
		result = add();
		System.out.println(result);
	}
	
	// 3. 매개변수는 있지만 반환값이 없는 메서드 : getter
	public static int rangleArea() {
		return num1 + num2;
	}
	public static double circleArea() {
		return radius * radius *pi;
	}
	public static int add() {
		return num1 + num2;
	}
	
	
}
