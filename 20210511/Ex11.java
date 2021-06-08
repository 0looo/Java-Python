
public class Ex11 {

	public static void main(String[] args) {
		int num = (int)(Math.random() * 6 +1);  // 1 ~ 6의 정수 random값
		System.out.println("num은 : " + num);
		switch(num) {
		case 1:System.out.println("1입니다.");break;
		case 2:System.out.println("2입니다.");break;
		case 3:System.out.println("3입니다.");break;
		case 4:System.out.println("4입니다.");break;
		case 5:System.out.println("5입니다.");break;
		case 6:System.out.println("6입니다.");break;
		// break를 사용하지 않을 경우 조건이후 모든 경우들을 출력함.
		}
	}

}
