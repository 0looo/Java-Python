
public class Ex05 {
	static int idx = 0;  // 정적 변수
	int num;
	String name;
	
	public static void staticMethod() {  // 정적메서드
		System.out.println("정적 메서드");
	}
	
	public void getName() {  // 일반 메서드
		System.out.println(idx);
		System.out.println(this.num);
		System.out.println(this.name);
	}

	public static int plus(int num1, int num2) { // 정적 메서드  =>객체 생성할 필요가 없음
		return num1 + num2;
	}
	
	
}
