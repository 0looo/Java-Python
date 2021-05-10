
public class Ex01 {

	public static void main(String[] args) {
		/// 사칙연산
		/// +. -. *. /
		System.out.println(3+5);
		System.out.println(3-5);
		System.out.println(3*5);
		System.out.println(3/5);
		
		// 변수활용
		int i = 5;
		int j = 3;

		int result = i + j ;
		System.out.println(result);
		result = i - j;
		System.out.println(result);
		result = i * j;
		System.out.println(result);
		result = i/j;
		System.out.println(result);
		
		// % : 나머지
		result = i%j;
		System.out.println(result);
		
		// int 4byte로 소수자리가 표현되지 않음 해결
		// 해결방법 : 계산시 한가지 변수를 double로 변경
		System.out.println((double)5/3);  // 하나의 값에 double 사용
		
		double result1 = (double)i / j;
		System.out.println(result1);
		
		char ch = 'A';  // (아스키 코드표)  A = 65
		System.out.println(ch);
		char ch1 = 'A' + 1;
		System.out.println(ch1);   // B 출력 (B = 66)
		
		char ch2;
		ch2 = 'A' + 1;
		System.out.println(ch2);
		
		char ch3 = 'A';
		ch3 += 1;  // 대입 연산자는 자연스럽게 형변환 => B로 출력
		System.out.println(ch3);
		
		// ch3 = ch3 + 1  => 67 출력
		// 		4byte + 2byte   ==> 4byte + 4byte로 계싼
		// 문자연산은 ASCII코드를 사용, 연산때는 정수연산으로 계산
		// 따라서 4byte로 계산한다.
		
		int ch4 = ch3 + 1;
		System.out.println(ch4); // 66
		
		
		
	}

}
