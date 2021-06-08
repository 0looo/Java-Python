
public class Ex05 {

	public static void main(String[] args) {
		// 4단 출력, 5 ~ 8곱
		for(int i = 5;i<=8;i++) {
			System.out.println("4 * " + i + " = " + i*4);
		}

		// 5단 출력, 5 ~ 8곱
		for(int i = 5;i<=8;i++) {
			System.out.println("5 * " + i + " = " + i*5);
		}
		
		// 6단 출력, 5 ~ 8곱
		for(int i = 5;i<=8;i++) {
			System.out.println("6 * " + i + " = " + i*6);
		}
		
		//4~ 6단 5~8곱
		for(int j = 4; j<=6;j++) {
			for(int i = 5;i<=8;i++) {
				System.out.println(j+" * " + i + " = " + i*j);
			}
			
		}
		
	}
}
