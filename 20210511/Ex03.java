
public class Ex03 {

	public static void main(String[] args) {
		//단일 if문 : true조건일때만 실행
		//if ~ else문 : else까지 활용
		int money = 25000;
		if(money >= 20000) {
			System.out.println("택시를 타고 가시오.");
		}else {
			System.out.println("지하철을 타고가시오");
		}
		System.out.println("if문 실행종료");
		System.out.println("==========");
		
		money = 19500;
		if(money >= 20000) {
			System.out.println("택시를 타고가시오");
		}else {
			System.out.println("지하철을 타고가시오");
		}
		System.out.println("if문 실행2");
	}

}
