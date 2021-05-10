
public class Ex16 {

	public static void main(String[] args) {
		// 돈이 20000이상 이면 택시, 미만일 경우 전철타고 감
		int money = 25000;
		if (money >= 20000) {
			System.out.println("택시타고가");
		}else {
			System.out.println("전철타고가");
		}
		System.out.println("===========");
		
		// score가 60점 이상이면 "합격", 아니면 "불합격"
		int score = 70;
		if (score >= 60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		 score = 59;
		 if (score >= 60) {
				System.out.println("합격");
			}else {
				System.out.println("불합격");
			}
		 System.out.println("=================");
		 
		 char gender = 'M';
		 if (gender == 'M') {
			 System.out.println("남자입니다.");
		 }else {
			 System.out.println("여자입니다.");
		 }
		 
		 gender = 'W';
		 if (gender == 'M') {
			 System.out.println("남자입니다.");
		 }else {
			 System.out.println("여자입니다.");
		 }
	}

}
