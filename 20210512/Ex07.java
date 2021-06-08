
public class Ex07 {

	public static void main(String[] args) {
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		////////////////////////////
		System.out.print("*");
		System.out.println();
		System.out.print("*");
		System.out.print("*");
		System.out.println();
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println();
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println();
		////// 위 아래 출력 결과가 동일함.
		
		
		for(int i =1; i<=4;i++) {
			for(int j =1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
