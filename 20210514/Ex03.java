
public class Ex03 {

	public static void main(String[] args) { //main 메서드
		int area = rangleArea(2, 3);  // 호출메서드
		// int area = 12;
		System.out.println(area);

		int i = add(3,5);
		System.out.println(i);
		
		String str = name(25, "king");
		System.out.println(str);
		
		double cir = circleArea(3, 3.141592);
		System.out.println(cir);
		
	}
	/// 매서드를 만드는 4가지 유형
	// 1. 기본 메서드 : 매개변수가 있고 반환 값이 있는 매서드
	public static int rangleArea(int num1, int num2){ // 피호출메서드
		return num1 * num2;
	}
	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	public static String name(int age, String name) {
		String str = "나의 이름은 " +name+", 나이는 " + Integer.toString(age);
		return str;
	}
	public static double circleArea(int radius, double pi) {
		return radius*radius*pi;
	}
	
}
