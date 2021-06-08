
public class Ex13 {

	public static void main(String[] args) {
		int num = (int)(Math.random() * 6 +1);  // 1 ~ 6의 정수 random값
		// 1, 4: 1과 4입니다.
		// 2, 5: 2와 5입니다.
		// 3, 6: 3과 6입니다.
		if(num==1 || num==4) {
			System.out.println("1 또는 4입니다.");
		}else if(num==2 || num==4) {
			System.out.println("2 또는 5입니다.");
		}else {
			System.out.println("3 또는 6입니다.");
		}
		
		System.out.println("switch");
		switch(num) {
		case 1:	case 4:	System.out.println("1 또는 4입니다."); break;
		case 2:	case 5: System.out.println("2 또는 5입니다."); break;
		case 3:	case 6: System.out.println("3 또는 6입니다."); break;			
		}
		
	}

}
