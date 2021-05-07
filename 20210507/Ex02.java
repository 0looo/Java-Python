
public class Ex02 {

	public static void main(String[] args) {
		char ch = 'A'; // ch = 'abcd';
		String str = "abcd";
		// 한글자 이상의 문자를 사용할 경우 String이라는 자료형을 사용하고 ""묶어서 사용한다
		
		System.out.println(ch);
		System.out.println(str);
		
		System.out.println();
		str = "";  // blank(빈문자)
		System.out.println(str + 'a');

		str = " "; // 공백문자
		System.out.println(str + 'a');
		
		ch = ' ';  // 공백문자는 ch에도 사용가능
		System.out.println(ch);
		// ch = '';   => error (빈문자는 ch에 쓸수 없다)
		
		// 문자열 연결 연산자 (+)
		String firstName = "YG" ;
		String lastName = "Lee";
		System.out.println("Lee" + "YG");
		System.out.println(lastName+firstName);
		
		// 문자, 문자열 구분  => '' 과 "" 차이
		System.out.println('A');  // 문자
		System.out.println("A");  // 문자열
		System.out.println('이');  // 문자
		System.out.println("이");  // 문자열
		

		
		
		
	}

}
