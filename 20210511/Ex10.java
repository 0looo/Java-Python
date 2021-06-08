
public class Ex10 {

	public static void main(String[] args) {
		System.out.println(Math.random());
		// 랜덤값을 가져오는 API
		// 범위 0.00000000000001 ~ 0.999999999999998
		// Math.random()을 이용해서 1 ~ 6사이에 있는 값을 가져오기.
		int num = (int)(Math.random() * 6) + 1;  // 1 ~ 6
		if(num ==1) {
			System.out.println("1입니다.");
		}else if(num==2) {
			System.out.println("2입니다.");
		}else if(num == 3) {
			System.out.println("3입니다.");
		}else if(num == 4) {
			System.out.println("4입니다.");
		}else if(num == 5) {
			System.out.println("5입니다.");
		}else if(num == 6) {
			System.out.println("6입니다.");
		}
		System.out.println("=================");
		
		
		// switch 주의점 
		// 1. 조건마다 break 써야함
		// 2. 조건이 등호일때만 사용가능하다.
		switch(num) {
		case 4 :
			System.out.println("4입니다."); break;
		case 3 :
			System.out.println("3입니다."); break;
		case 1 :
			System.out.println("1입니다."); break;
		case 5 :
			System.out.println("5입니다."); break;
		case 2 :
			System.out.println("2입니다."); break;
		case 6 :
			System.out.println("6입니다."); break;
		}
	}

}
