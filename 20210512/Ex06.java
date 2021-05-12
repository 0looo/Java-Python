import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작단을 입력하시오. : ");
		int startDan = sc.nextInt();
		System.out.print("끝단을 입력하시오. : ");
		int endDan = sc.nextInt();
		System.out.print("시작곱을 입력하시오. : ");
		int startGop = sc.nextInt();
		System.out.print("끝곱을 입력하시오. : ");
		int endGop = sc.nextInt();
		
		for(int i = startDan; i<= endDan; i++) {
			for(int j=startGop; j<=endGop; j++) {
				System.out.println(i+" * "+j+" = "+i*j);
			}
		}
		
		sc.close();

	}

}
