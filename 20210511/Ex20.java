import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// 원하는 범위의 수를 입력 받아 범위의 수를 더한 값을 출력하시오.
		// 시작 값, 마지막 값을 입력, 사이의 값을 합산.
		Scanner sc = new Scanner(System.in);
		System.out.print("시작값을 입력하세요. : ");
		int start = sc.nextInt();
		System.out.print("마지막 값을 입력하세요. : ");
		int end = sc.nextInt();
		int result = 0;
		
		for(int i = start; i <= end; i++) {
			result += i;
		}
		System.out.println(result);
		sc.close();
	}

}
