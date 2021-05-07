
public class Ex04 {

	public static void main(String[] args) {
		// 자동 형변환 / 강제 형변환(overflow)
		byte b = -128;
		System.out.println(b);
		b= 127;
		System.out.println(b);
		
		short sh = -32768;
		System.out.println(sh);
		sh = 32767;
		System.out.println(sh);
		
		sh = b; // 자동 형변환 : 큰 자료형 = 작은 자료형
		// byte < short < int < long  << float < double
		// 정수 < 실수
		
		long l = 12345;
		float f = l;  // 정수가 실수로 변환됨
		System.out.println(f);
		System.out.println(l);
		double d = f;
		System.out.println(d);
		// 즉, 자동형변환은 기본자료형에서만 가능하다.
		
	}

}
