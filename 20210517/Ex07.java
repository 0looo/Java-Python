
public class Ex07 {
	static double pi = 3.141592;
	// 구구단
	public static void gugu(int dan) {
		for(int i =1 ; i<10;i++) {
		System.out.println(dan + " * " + i + " = " + dan*i);
		}
	}
	
	// 원의 면적
	public static void circle(int radius) {
		System.out.println(radius*radius*pi);
	}
	
	// 합구하기
	public static void sum(int start, int end) {
		int sum = 0;
		for(int i = start; i<=end; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	
	
}
