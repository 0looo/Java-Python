
public class Ex03 {

	public static void main(String[] args) {
		// 기본 자료형 : 정수(byte, short, int, long), 실수, 문자
		//			 boolean(부울) : True, False
		//				사용 >> if, while에서 주로 사용됨
		
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1);
		System.out.println(b2);
		
		String str = "true" ;
		System.out.println(str);  // b1과 str은 다르다.(출력형태만 같음)
		
		int i = 10; // 정수
		str = "10"; // 문자형
		
		// 참조 자료형 : String, 배열
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		
		// == 의 의미  => 주소를 비교함
		System.out.println(str1 == str2);  // str1과 str2의 주소 비교 ((heap의 대한 주소비교)
		System.out.println(str1 == str3);  // 주소가 다르기 때문에 False 출력
		
		// 값비교하기위한 연산 
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		
		
		
	}

}
