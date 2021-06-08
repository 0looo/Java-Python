
public class Ex14 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*10) +1; // 1 ~ 10의 정수 
		if(num==1) {
			System.out.println("1입니다.");
		}else if(num==2) {
			System.out.println("2입니다.");
		}else if(num==3) {
			System.out.println("3입니다.");
		}else if(num==4) {
			System.out.println("4입니다.");
		}else {
			System.out.println("1~4외의 값입니다.");
		}
		
		System.out.println("switch");
		switch(num) {
		case 1 : System.out.println("1입니다.");break;
		case 2 : System.out.println("2입니다.");break;
		case 3 : System.out.println("3입니다.");break;
		case 4 : System.out.println("4입니다.");break;
		default : System.out.println("1~4이외의 값입니다.");
		}
	}

}
