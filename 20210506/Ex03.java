
public class Ex03 {
	public static void main(String [] args) {
		// 리터널 : 자연어
		// 정수 : 3, 5, 9 ..
		// 실수 : 0.5, 1.6 ...
		// 문자 : 'a' : '' 안에는 문자 하나만 사용해야함.
		// 문자열 : "aaa", "a" : "" 사용시 무조건 문자열로 인식
		System.out.println(3+5);
		System.out.println(3/5);
		System.out.println(3*5);
		System.out.println(3-5);

		// 리터널 저장 : 변수
		// 변수선언 
		// 자료형 변수명 = 리터널 값;
		
		int a = 10; // 정수 저장된 변수
		System.out.println(10);
		System.out.println(a);
		
		a = 20;
		System.out.println(a);
		
		// int로 변수선언, error 발생 예시
		// a = "a" ;
		// a = 10.5 ; 
				
		// 자료형 : 리터널 값의 type을 결정해줌 
		// int : 자료형 중 정수 (integer의 약자)
		
		double d = 10.5;
		// double : 실수형 리터널 저장하는 변수
	}
}
