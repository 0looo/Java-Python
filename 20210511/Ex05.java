import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		double i = 3;
		double j = 2;
		System.out.println(i / j);

		// error => int 일때 분모가 0이면 error
		//int i1 = 3 , j1 = 0;
		//System.out.println(i1 / j1);
		
		int i1 = 3;
		int j1 = 1;
		System.out.println(i /j);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("분자값을 숫자로 입력하시오.:");
		i1 = sc.nextInt();
		System.out.println("분모값을 입력하시오.:");
		j1 = sc.nextInt();
		if(j1 == 0) {
			System.out.println("0이 아닌 값으로 다시 입력해주세요.");
		}else {
			System.out.println((double)i1/j1);
		}
		
		sc.close();
	}

}
