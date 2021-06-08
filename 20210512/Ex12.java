import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("시작숫자를 입력해주세요. : ");
		int start = sc.nextInt() ;
		System.out.print("마지막 숫자를 입력해주세요.:");
		int end = sc.nextInt();
		System.out.print("더할 배수를 입력해주세요. :");
		int num = sc.nextInt();
		
		int i = start-1;
		int sum = 0;
		while(i < end){
			i++;
			if(i%num !=0) continue;
			sum += i;
			}
		System.out.println(sum);
		sc.close();
	}
	
}
