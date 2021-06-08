
public class Ex10 {
	static int idx;	// static 변수의 초기값은 기본값이다.
	// static 변수 초기화 방법
	// 1. 생성자
	// 2. static 블럭 이용
	static {
			idx = 10;	// static 변수를 10으로 초기화.
			// i = 20;  // 인스턴스 변수는 초기화 불가
	}
	// 3. setter (인스턴스 변수 또한 동일)
		// 1) 생산자
	public Ex10(int idx, int i) {
		this.i = i;	// 인스턴스 변수
		this.idx = idx;	// 정적 변수
	}
		// 2) setter
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public void setI(int i) {
		this.i = i;
		}
		
		// default 생성자
	public Ex10() {}
		
	static void setVal(int idx1) {
		idx = idx1;	// static 안에서는 this를 사용할 수 없음.
					// 때문에 매개변수의 이름을 다르게 표시.
	}
	
	
	int i;			// 인스턴트 변수또한 초기값은 기본값이다.
	// 인스턴스 변수 초기화 방법 : setter, 생성자
	
	public void test() {
		int j = 0;	// 지역 변수는 초기값을 갖지 않음.
		System.out.println(j);	// initialized error
								
	}
}
