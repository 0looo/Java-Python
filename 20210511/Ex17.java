
public class Ex17 {

	public static void main(String[] args) {
		// 3단을 출력
		System.out.println("3*1 = 3");
		System.out.println("3*2 = 6");
		System.out.println("3*3 = 9");
		System.out.println("3*4 = 12");
		System.out.println("3*5 = 15");
		System.out.println("3*6 = 18");
		System.out.println("3*7 = 21");
		System.out.println("3*8 = 24");
		System.out.println("3*9 = 27");
		System.out.println("반복문 사용");
		
		for(int i = 1; i<10; i++) {
			System.out.println("3*"+ i +" = " + 3*i);
		}
	}

}
