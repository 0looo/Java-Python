import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// 돈이 20000이상이거나 card가 있으면 택시를 타고 아닐경우 걸어가시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("카드소유여부를 알려주세요(y/n) : ");
		String card = sc.nextLine();
		
		System.out.print("소유금액을 입력하세요 : ");
		int money = sc.nextInt();
		
		if ((money >= 20000) || (card.equals("y"))) {
			System.out.println("택시를 타고 이동하세요.");
		}else {
			System.out.println("도보로 이동하세요.");
		}
				
		// 4년 마다 윤년이지만 100년마다는 윤년이 아니다. 그렇지만 400년 마다는 윤년이어야 한다.
		int year = 2104;
		boolean b = (year % 4 ==0) && (year % 100 != 0) || (year % 400 == 0);
		if(b){
			System.out.println("윤년");
		}else {
			System.out.println("윤년이 아니다.");
		}
		
		// 비교연산자와 논리연산자를 사용할경우
		System.out.println(year + " 년은 윤년이다. : " + b);
		
		sc.close();
	}

}
