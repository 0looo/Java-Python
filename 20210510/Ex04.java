
public class Ex04 {

	public static void main(String[] args) {
		// 선행연산, 후행연산 차이
		// => 변수로 출력시 차이 발생
		
		int i = 10;
		i--; 
		System.out.println(i);
		System.out.println("==================");
		System.out.println(i--); // 9
		System.out.println(i);  // 8
		
		//후행
		int j = 10;
		System.out.println(j--); // 후행 : 10
		
		//선행
		int z = 10;
		System.out.println(z);
		System.out.println(--z); // 선행 : 9
		

	}

}
