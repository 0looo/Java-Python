import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// 중첩 if문 
		// 60점 이상이면 합격, 아니면 불합격
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요. : ");
		int score = sc.nextInt();
		if(score >= 60) {
			System.out.println("합격");
			if(score >= 90) {
				System.out.println('A');
			}else if(score >= 80) {
				System.out.println('B');
			}else if(score >= 70) {
				System.out.println('C');
			}else if(score >= 60) {
				System.out.println('D');
			}
			
		}else {
			System.out.println("불합격");
		}
		sc.close();

	}

}
