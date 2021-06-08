
public class Ex04 {

	public static void main(String[] args) {
		rangleArea(3,4);

	}
	
	// 2. 매개변수는 있지만 반환값이 없는 메서드 : setter
	public static void rangleArea(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
	}
	public static void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	public static void fullName(String lastName, String firstName) {
		String fullName = lastName + firstName;
		System.out.println(fullName);
	}
}
