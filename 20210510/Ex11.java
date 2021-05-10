
public class Ex11 {

	public static void main(String[] args) {
		// 비교연산
		int i = 10;
		int j = 65;
		int z = 70;
		
		boolean b = i > j; //false
		boolean b1 = j == z; // false
		boolean result = b && b1;
		System.out.println(result);
		System.out.println(b&&b1);
		System.out.println(i>j && j==z);
		
		b = i<j; // true
		b1 = j < z; // true
		result = b && b1;
		System.out.println(result);
		System.out.println(b&&b1);
		
		
	}

}
