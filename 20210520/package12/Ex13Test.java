package package12;

import java.util.Scanner;

public class Ex13Test {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.print("분자값을 입력하세요. : ");
			int num1 = sc.nextInt();
			System.out.print("분모값을 입력하세요. : ");
			int num2 = sc.nextInt();
			try {
				System.out.println(num1/num2);	
			}catch(ArithmeticException e) {
				System.out.println("분모값을 0외의 값으로 설정하세요.");
			}
			
			System.out.print("break : 0 press, continue : anykey");
			int stop = sc.nextInt();
			if (stop ==0) break;
		}
		sc.close();
	}
}
