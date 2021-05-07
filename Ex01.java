
public class Ex01 {

	public static void main(String[] args) {
		//  										4byte    8byte
		// 리터널 : 자연어 : 정수    : 10, 1, 2, ....    : int,     long
		//      		 실수    : 0.5, 1.3 ...   	  : float, double
		//				 문자    : 'A', 'B',...		  : char
		//			 	 문자열  : "as". "asdf" ...  : string
		// 정수 데이터의 기본크기 : 4byte
		System.out.println(Integer.MAX_VALUE);  // 최대 2147483647
		System.out.println(Integer.MIN_VALUE);  // 최소 -2147483648
		// System.out.println(-2147483649);    =>  error(범위 밖 숫자)
		// System.out.println(2147483647);		=> error
		
		// 해결방법
		System.out.println(-2147483649L);   // L을 붙혀서 long으로 사용
		
		// 실수 데이터 기본크기 : 8 byte : 10^(-17) 까지 표현가능 , 이후 자리는 버림처리 
		System.out.println(0.123456789123456789);   
		
		// 범위 줄이는 방법 (float로 표현)
		System.out.println(0.123456789123456789F);  // f를 붙혀 사용, 8자리까지 표현, 9번째 반올림 처리 
		// 실수의 크기는 정확도를 의미
		
		// 출력시 자연어 출력 비추천   =>  변수사용해서 출력
		System.out.println(10);
		
		// 변수선언
		int i = 10;  // 자료형 변수 순서
		// i = 10.5; => error(int가 아닌 자연어)
		System.out.println(i);
		
		double d = 10.5;
		// d ="abcd" => error
		System.out.println(d);
		
		char ch = 'A';
		System.out.println(ch);
		
		String str = "abc";
		System.out.println(str);
		
		//  변수 선언, 초기값, 대입
		int i = 10;
		System.out.println(i);
		
		int j;
		// System.out.println(j);  // error = initialized
		j = 10;
		System.out.println(j);
		
		j = 20;
		System.out.println(j);
	
		
	}

}
