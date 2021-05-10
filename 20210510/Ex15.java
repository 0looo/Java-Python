
public class Ex15 {

	public static void main(String[] args) {
		/// 조건문 : 선택하고자 할때 사용
		// if (조건) {참일때 출력내용}
		// if문의 결과값 type : boolean(true, false)
		
		int money = 25000;
		if (money >= 20000) {
			System.out.println("택시타고가");
		}
		System.out.println("조건문이 끝나서 실행");
		System.out.println("=================");
		
		money = 19500;
		if (money >= 20000) {
			System.out.println("택시타고가");
		} else {
			System.out.println("버스타고가");
		}
		
		
		// 문제 : score가 90 이상이면 'A'를 출력하시오.
		int score = 95;
		if (score >= 90) {
			System.out.println('A');
		}
		
		score = 80;
		if (score >= 90) {
			System.out.println('A');
		}else {
			System.out.println('F');
		}
	}

}
