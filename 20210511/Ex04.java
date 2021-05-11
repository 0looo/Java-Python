import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		System.out.println("입력된 값을 화면 출력");
		System.out.print("입력된 값을 화면 출력 \n");
		// 키보드 값을 입력 받기 위한 API : Scanner
		int i  = 10; // 자료형 변수명 = 값
		i = 20;
		
		// 자료형이란 어떠한 값을 저장할 것인지를 나타내는 것
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하시오. : ");
		int money = sc.nextInt(); // 키보드로 입력된 값을 받아 옴.
		System.out.println("Scanner를 통해 값을 받아왔습니다.");
		if(money >= 20000) {
			System.out.println("택시를 타고 가시오.");
		}else {
			System.out.println("지하철을 타고가시오.");
		}
		sc.close();
	}
}
