
public class Ex02 {

	public static void main(String[] args) {
		int money = 25000;
		if(money >= 20000) {
			System.out.println("택시타고가자");
		}
		System.out.println("if문 종료");
		System.out.println("=============");
		
		money = 19500;
		if(money >= 20000) {
			System.out.println("택시타고가자");
		}else {
			System.out.println("지하철타고가자");
		}
		System.out.println("if문 종료");
		System.out.println("============");
	
	}

}
