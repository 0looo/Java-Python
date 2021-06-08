
public class Ex13 {

	public static void main(String[] args) {
		int i = 60;
		int j = 70;
		boolean b= i > 50; // true
		boolean b1 = j < 60; // false
		boolean result = b && b1;  // true && false : false
		System.out.println(result);

		result = b || b1; // true || false : true
		System.out.println(result);
		
		System.out.println(!result);
		System.out.println(!b || b1);
		System.out.println(!(b||b1));
		
		// 단항연산 : ++, --; i++, j--
		// 이항연산자 : +,-, *, /, % : 산술연산자
		//			<, >, <=, >= : 비교연산자 , 관계연산자
		//			&&, || : 논리연산자
	}

}
