
public class Ex07 {

	public static void main(String[] args) {
		int i = 10;
		int result = i--;
		// result = i // 10
		// i = i - 1 // 9
		System.out.println(result); // 10
		System.out.println(i);  // 9
		
		int j = 10;
		result = --j;
		// result = j // 9
		// j = j - 1 // 9
		System.out.println(result); // 9
		System.out.println(j); // 9
		
		i = 10;
		j = 10;
		// 계산순서
		//	   3  1  2  4	
		result = ++i + j--;
		/* i = i + 1;
		 * result = i + j; // result = 11 + 10
		 * j = j - 1; // j = 10 - 1 = 9
		 */
		System.out.println(i);  // 11
		System.out.println(j);  // 9
		System.out.println(result); // 21
		
		i = 10;
		j = 10;
		// 계산순서
		//     3  4  2  1
		result = i-- + ++j;
		/* j = j + 1;
		 * result = i + j;
		 * i = i - 1;
		 */
		System.out.println(i);
		System.out.println(j);
		System.out.println(result);
				
		i = 10;
		j = 10;
		// 계산순서
		//     4  1  3  2 
		result = ++i + --j;
		/* i = i + 1;  // i = 10 + 1
		 * j = j - 1;  // j = 10 - 9
		 * result = i + j;
		 */
		System.out.println(i);
		System.out.println(j);
		System.out.println(result);
		
		i = 10;
		j = 10;
		// 계산순서
		//     2  3  1  4 
		result = i-- + j++;
		/* result = i + j;
		 * i = i -1 // i = 10 - 1
		 * j = j +1 // j = 10 + 1
		 */
		System.out.println(i);
		System.out.println(j);
		System.out.println(result);
		
	}

}
