package package12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex17Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		
		while(true) {
		System.out.print("���ڸ� �Է����ּ��� : ");
		
			try {
				num1 = sc.nextInt();
			}catch(InputMismatchException e) {
				sc.next();
				System.out.println("���ڸ� �Է����ּ���.");
				continue;
			}
		System.out.print("���ڸ� �Է����ּ��� : ");
			try {
				num2 = sc.nextInt();
			}catch(InputMismatchException e) {
				sc.next();
				System.out.println("���ڸ� �Է����ּ���.");
				continue; }
		
		System.out.println(num1 + num2);
		}

	}
}
