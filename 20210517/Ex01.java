
public class Ex01 {
	// stack과 static 비교
	// 동적변수  정적변수
	
	static double pi = 3.141592;    // 모든객체가 공유해서 사용함.
									// 객체 생성을 하지 않고 사용가능한 변수
									// class명. 변수
									// 클래스 변수
	
	int i = 10;						// 인스턴스 변수
	double d = 20.5;
	
	// stack은 자동 copy 되지만 static은 원본을 불러들임.
	// 즉 static의 수정은 원본 수정을 뜻함.
}
