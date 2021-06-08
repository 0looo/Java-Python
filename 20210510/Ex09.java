
public class Ex09 {

	public static void main(String[] args) {
		// 비교 연산자   ** if, for : 제어문 주로 사용
		// 비교 연산자의 결과값은 bool type : 논리형
		int i = 10; 
		int j = 20;
		boolean b = i > j; // false
	
		System.out.println(b);
		System.out.println("i > j : " + (i > j));  // false
		
		b = i < j;
		System.out.println(b);
		System.out.println("i < j : " + (i < j));

		b = i == j ;  // false
		System.out.println(b);
		System.out.println("i == j : " + (i==j));
		
		// float와 double 비교
		float f = 20.1f;
		double d = 20.1;
		b = f == d;
		System.out.println(b);  // false
		System.out.println("f == d :" + (f==d));
		// false 나오는 이유
		float f1 = 0.123456789f;
		System.out.println(f1);
		double d1 = 0.123456789;
		System.out.println(d1);
		/* f1 = 0.123456789f;  //  0.12345679
		 * d1 = 0.123456789;  // 0.123456789 
		 */
		
		// true 만드는 법
		// 1. 큰타입을 작은타입에 맞춰준다.
		b = f == (float)d;
		System.out.println(b);  // true
		System.out.println("f == (float)d : " + (f == (float)d));
		// 작은 타입을 큰타입으로 맞추지 않는 이유 : 값이 다름
		b = (double)f == d;
		System.out.println(b);
		System.out.println("(double)f == d : " + ((double)f == d));
		
		/// type이 달라도  true가 나오는 경우
		// : 소수점 자리 값이 0일 경우 true 출력
		i = 1;
		d = 1.0;
		b = i == d;  // 4 byte == 8 byte  => 8byte == 8byte
		System.out.println(b);
		
	}

}
