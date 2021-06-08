
public class Ex18 {

	public static void main(String[] args) {
		// 5단 출력하는데 홀수 곱만 출력
		System.out.println("5*1=5");
		System.out.println("5*3=15");
		System.out.println("5*5=25");
		System.out.println("5*7=35");
		System.out.println("5*9=45");
		
		System.out.println("반복문 사용");
		
		for(int i=1; i<10; i+=2) {
			System.out.println("5*"+i + "=" + 5*i);
		}
	}

}
