
public class Ex02 {

	public static void main(String[] args) {
		// 4단 출력
		for(int i = 1; i < 10; i++) {
			System.out.println("4 * "+i+" = "+ 4*i);
		}

		// 5단 출력
		for(int i = 1; i < 10; i++) {
			System.out.println("5 * "+i+" = "+ 5*i);
		}
		
		// 6단 출력
		for(int i = 1; i < 10; i++) {
			System.out.println("6 * "+i+" = "+ 6*i);
		}

		//////////////////////////
		// 이중 반복문
		for(int x = 4; x<7;x++) {
			for(int i = 1; i < 10; i++) {
				System.out.println(x+" * "+i+" = "+ x*i);
			}

		}
		
		gugu(2);
		gugu(5);
		gugu(7);
		
	}
	// 반복적으로 사용되는 명령어를 정의해 두었다가 필요할때마다 호출
	public static void gugu(int dan) {
		for(int i = 1; i < 10; i++) {
			System.out.println(dan+" * "+i+" = "+ dan*i);
		}
	}

}
