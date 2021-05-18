
public class Ex03 {
	int i ;			// instance 변수	: 객체내에 있는 변수
	static int j;	// class 변수		: 객체끼리 데이터 공유
	int i1, i2;		// instance 변수는 한번에 여러개 선언 가능
	
	void method() {
		int t;		// 지역변수
	}
	public void test(int i, int j) {
		System.out.println(i);
		System.out.println(j);
	}
	
	// public void test1(int i,j,z) {}   // 매개변수는 한번에 여러개 선언 불가능
}
