package package12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex17Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		
		while(true) {
		System.out.print("숫자를 입력해주세요 : ");
		
			try {
				num1 = sc.nextInt();
			}catch(InputMismatchException e) {
				sc.next();
				System.out.println("숫자만 입력해주세요.");
				continue;
			}
		System.out.print("숫자를 입력해주세요 : ");
			try {
				num2 = sc.nextInt();
			}catch(InputMismatchException e) {
				sc.next();
				System.out.println("숫자만 입력해주세요.");
				continue; }
		
		System.out.println(num1 + num2);
		}

	}
}
