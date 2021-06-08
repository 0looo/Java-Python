
public class Ex08 {

	public static void main(String[] args) {
		// "1번재입니다." ~ "10번째입니다."  출력
		// for
		// 순서: 1     2    4
		for(int i =1;i<=10;i++) {
			System.out.println(i+"번재 입니다."); // 3
		}
		
		// while
		int i = 1;  //1
		while(i<=10) {//2
			System.out.println(i+"번째입니다."); //3
			i++; //4
		}
		///
		i = 0;
		while(i<10) {
			i++;
			System.out.println(i + "번째입니다.");
		}

		// 5단
		// for
		for(i=1;i<10;i++) {
			System.out.println("5 * " + i + " = " + 5*i);
		}
		
		//while
		int j = 1;
		while(j<10) {
			System.out.println("5 * "+ j +" = "+5*j);
			j++;}
		
		j = 0;
		while(j<9) {
			j++;
			System.out.println("5 * "+ j +" = "+5*j);}
		
		// 3단 3~7곱
		int z = 3;
		while(z<8) {
			System.out.println("3 * " + z + " = " + 3*z);
			z++;
		}
	}

}
