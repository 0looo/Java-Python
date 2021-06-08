import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		while(true) {
			System.out.println("더하기는 1|빼기 2|곱하기3|나누기4|종료 5");
			System.out.print("숫자를 선택하세요. : ");
			String num = sc.next();
			
			try {
				switch(num) {
				case "1" :
					System.out.print("첫번째 숫자를 입력하세요 : ");
					num1 = sc.nextInt();
					System.out.print("두번째 숫자를 입력하세요 : ");
					num2 = sc.nextInt();
					System.out.println(num1 + num2);
					break;
					
				case "2" :
					System.out.print("첫번째 숫자를 입력하세요 : ");
					num1 = sc.nextInt();
					System.out.print("두번째 숫자를 입력하세요 : ");
					num2 = sc.nextInt();
					System.out.println(num1 - num2);
					break;
					
				case "3" : 
					System.out.print("첫번째 숫자를 입력하세요 : ");
					num1 = sc.nextInt();
					System.out.print("두번째 숫자를 입력하세요 : ");
					num2 = sc.nextInt();
					System.out.println(num1 * num2);
					break;
					
				case "4" : 
					System.out.print("첫번째 숫자를 입력하세요 : ");
					num1 = sc.nextInt();
					System.out.print("두번째 숫자를 입력하세요 : ");
					num2 = sc.nextInt();
					System.out.println(num1 / num2);
					break;
					
				case "5" :
					System.out.println("시스템을 종료합니다.");
					System.exit(0);
					break;
					
				default : 
					System.out.println("입력값을 확인해주세요.");
				}}
			
			catch(InputMismatchException e) {
				System.out.println("입력값을 숫자로 해주세요.");
				continue;
				}
			catch(Exception e) {
				//e.printStackTrace();
				System.out.println(e);
				continue;
			}
		}
	}
}