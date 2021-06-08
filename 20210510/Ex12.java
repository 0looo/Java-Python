
public class Ex12 {

	public static void main(String[] args) {
		// or 연산 (||)
		/// pipe : 연결
		
		int i = 65;
		int j = 55;
		int z = 90;
		boolean b = i == j;  // false
		boolean b1 = j >z;  // false
		boolean result = b || b1; // false || false : false
		System.out.println(result);
		System.out.println(b || b1);
		System.out.println(i ==j || j>z);
		
		b = i > j; // true
		b1 = j > z; // false
		result = b || b1; // true || false : true
		System.out.println(result);
		System.out.println(b || b1);
		System.out.println(i > j || j >z);
		
		
	}

}
