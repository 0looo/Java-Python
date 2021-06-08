
public class Ex05 {

	public static void main(String[] args) {
		/// 선행 후행 차이
		// 우선 순위의 차이 (변수 지정이 먼저인가 연산이 먼저인가)
		
		int i = 10;
		int result = ++i; // 선행
		/* i = i + 1; // i = 10 + 1; // 11
		 * result = i  // result = 11
		 */

		System.out.println(i);  // 11
		System.out.println(result); // 11
		
		int j = 10;
		result = j++; // 후행
		/* result = j; // result = 10;
		 * j = j + 1;  // j = 10 + 1; // 11
		 */
		System.out.println(result);
		System.out.println(j);
		
	}

}
