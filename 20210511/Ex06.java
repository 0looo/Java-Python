import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// 90 이상이면 'A'. 80 이상이면 'B', 70이상이면 'C', 60이상이면 'D'. 아니면 'F'출력
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력해주세요. : ");
		int score = sc.nextInt(); 
		if(score >= 90) {
			System.out.println('A');
		}else if(score>= 80) {
			System.out.println('B');
		}else if(score>= 70) {
			System.out.println('C');
		}else if(score>= 60) {
			System.out.println('D');
		}else {
			System.out.println('F');
		}
		
		sc.close();
		}
	}
