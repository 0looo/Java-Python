import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("나누기를 시작하겠습니다.");
			System.out.print("분자값을 입력하세요 : ");
			int num1 = sc.nextInt();
			System.out.print("분모값을 입력하세요 : ");
			int num2 = sc.nextInt();
			try {
				System.out.println("결과 : "+ num1 / num2);
			}catch(ArithmeticException e) {
				System.out.println("분모는 0외의 값을 입력하세요.");
				continue;
			}
			System.out.println("종료 : y, 계속 : 그외값 입력");
			String stop = sc.next();
			if(stop.equals("y"))break;
			sc.close();
		}
	}

}
