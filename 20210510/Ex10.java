
public class Ex10 {

	public static void main(String[] args) {
		// 논리연산  : 참과 거짓인 값을 연산
		// and(&&) 와 or(||) 연산

		/// and연산 : 교집합
		// 참 and 참 : 참
		// 참 and 거짓 : 거짓
		// 거짓 and 거짓 : 거짓
		
		/// or 연산 : 합집합
		// 참 or 참 : 참
		// 참 or 거짓 : 참
		// 거짓 or 거짓 : 거짓
		
		// 논리연산을 하려면 결과 값이 부울 타입이어야 하기 때문에
		// 부울 타입의 결과를 가지는 연산은 비교연산이므로 동시에 사용한다.
		
		int i = 65;
		int j = 70;
		int z = 80;
		boolean b = i < j; // true
		boolean b1 = i > z; // false
		boolean result = b && b1;
		System.out.println(result);
		System.out.println(b && b1);
		System.out.println(i<j && i>z);
		
	}

}
