
public class Ex14 {
	// 상수는 초기값을 무조건 줘야함.
	
	// 상수 초기화 방법
	
	final double PI;
	final String national;
	int val;
	
	// 상수는 초기값을 넣어주는 것만가능
	// default 생산자 사용 불가
	public Ex14() {
		this.PI = 3.141592;
		this.national = "korea";
	}
	public Ex14(int pi, String na) {
		this.national = na;
		this.PI = pi;
	}
}
