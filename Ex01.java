
public class Ex01 {

	public static void main(String[] args) {
		/*
		 * #나무를 1번 찍었습니다.
		 * #나무를 2번 찍었습니다.
		 * #나무를 3번 찍었습니다.
		 * #나무를 4번 찍었습니다.
		 * #나무를 5번 찍었습니다.
		 * #나무를 6번 찍었습니다.
		 * #나무를 7번 찍었습니다.
		 * #나무를 8번 찍었습니다.
		 * #나무를 9번 찍었습니다.
		 * #나무를 10번 찍었습니다.
		 * 나무가 넘어갑니다.
		 */
		
		for(int i = 1 ; i <= 10 ; i++) {
			System.out.println("나무를 " + i + "번 찍었습니다.");
			if(i == 10) {
				System.out.println("나무가 넘어갑니다.");
			}
		}
		
		int i ;
		for(i = 1; i <= 10; i++) {
			System.out.println("나무를 " + i + "번 찍었습니다.");
		}
		if (i == 10) {
			System.out.println("나무가 넘어갑니다."); // 미출력 : i = 11로 끝남
		}
		

	}

}
