
public class Ex02 {

	public static void main(String[] args) {
		// 단한 연산(++. --)
		int i = 0;
		i = i+1; // i = 0 + 1
		System.out.println(i);  // i = 1
		i = i + 1; // i = 1 + 1
		System.out.println(i);  // i = 2
		i = i + 1; // i = 2 + 1
		System.out.println(i);  // i = 3

		/// 선행 연산 vs 후행 연산
		// 후행연산
		int j = 0;
		j++;
		System.out.println(j); // 1
		j++;
		System.out.println(j); // 2
		j++;
		System.out.println(j); // 3
		
		// 선행연산
		
	}

}
