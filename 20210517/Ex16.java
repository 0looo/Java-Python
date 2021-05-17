
public class Ex16 {
	static final double PI;
	static final String national;
	int val;
	// static 상수(정적 상수)는 생성자로 초기화 불가능함.
	// ==> static 블럭만 가능
	
	static {
		PI = 3.141592;
		national = "korea";
	}
	/* 
	public Ex16(double pi, String national) {
		this.PI = pi;
		this.national = national;
	}
	*/
}
