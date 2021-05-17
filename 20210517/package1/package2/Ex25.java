package package1.package2;

public class Ex25 {
	// 접근 지정자
	protected int num1;
	protected int num2;
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public int mul() {
		return num1 * num2;
	}
	
	public int div() {
		if(num2==0) {
			return 0;
		}else {
		return num1 / num2;
		}
	}
	
}

// 정적 변수 : static int i = 10;	// 객체가 공유해서 사용하는 데이터
// 상수 : 일반 상수 final int i = 10
//		 정적 상수 static final int i = 10;

// 초기화
// 일반 상수 : 생성자
// 정적 상수 : static 블럭

// 객체지향의 특징 : 캡슐화, 상속 : 오버라이드