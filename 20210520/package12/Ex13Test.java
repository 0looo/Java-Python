package package12;

import java.util.Scanner;

public class Ex13Test {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.print("���ڰ��� �Է��ϼ���. : ");
			int num1 = sc.nextInt();
			System.out.print("�и��� �Է��ϼ���. : ");
			int num2 = sc.nextInt();
			try {
				System.out.println(num1/num2);	
			}catch(ArithmeticException e) {
				System.out.println("�и��� 0���� ������ �����ϼ���.");
			}
			
			System.out.print("break : 0 press, continue : anykey");
			int stop = sc.nextInt();
			if (stop ==0) break;
		}
		sc.close();
	}
}