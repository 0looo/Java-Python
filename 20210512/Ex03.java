
public class Ex03 {

	public static void main(String[] args) {
		// 구구단 3단
		for (int i = 1; i < 10 ; i++) {
			System.out.println("3 * " + i + " = "+ i*3);
		}

		// 구구단 4단
		for (int i = 1; i < 10 ; i++) {
			System.out.println("4 * " + i + " = "+ i*4);
		}
		
		// 구구단 5단
		for (int i = 1; i < 10 ; i++) {
			System.out.println("5 * " + i + " = "+ i*5);
		}
		
		// 구구단 2 ~ 9단 출력
		for(int j=2;j<10;j++) {
			for (int i = 1; i < 10 ; i++) {
				System.out.println(j+" * " +i + " = "+ i*j);
			}
		}
	}

}
