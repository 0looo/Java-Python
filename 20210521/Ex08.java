import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요 : ");
		int num2 = sc.nextInt();
		try {
			div(num1, num2);}
		catch(ArithmeticException e) {
			
		}
		
		

	}
	public static void div(int i, int j) throws ArithmeticException{
		System.out.println(i/j);
	}

}
