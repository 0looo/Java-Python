
public class Ex05 {

	public static void main(String[] args) {
		// 강제 형변환 : 작은 자료형 = (작은 자료형)큰 자료형
		// double > float > long > int > short > byte 
		
		// ex
		long l = 10;
		int i = (int)l;
		System.out.println(i);
		
		l = -2147483648;
		i = (int)l;
		System.out.println(l);
		
		// 오버플로우 = 강제 형변환에서 크기에 문제가 있을 경우 값이 변한다.
		// ex
		l = -2147483649L;
		i = (int)l;
		System.out.println(i);
		// 강제 형변환의 경우 오버플로우 조심헤야함.
		
		float f = 10;  // 자동 형변환 : 10.0
		System.out.println(f);
		f = 12.664566665f;
		i = (int)f;  // 실수를 정수로 형변환시 정수값만 가져옴.(소수자리 버림)
		// 활용 : 몫 구할때 많이 사용
		System.out.println(f);
		System.out.println(i);
		
		System.out.println(10.0 % 3.0); // (10 / 3) 의 나머지
		System.out.println(10 % 3);
		System.out.println((int)(10.0 / 3.0));  // (10 / 3)의 몫
		// 주의
		System.out.println((int)10.0/3.0);  // int뒤 가로로 묶지 않을 경우 10.0만 int로 변경됨.
		
	}

}
