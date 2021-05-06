
public class Ex07 {

	public static void main(String[] args) {
		int i = -2147483648;  // 4byte
		System.out.println(i);

		i = 2147483647;
		System.out.println(i);
		
		long l = -2147483649L;  // 8byte
		System.out.println(l);
		
		l = 2147483648L;
		System.out.println(l);
		
		System.out.println(0.123456789123456789);
		// 실수 : 자리수가 중요(크기가 중요하지 않음)
		// 10^(-17)까지 사용가능
		
		double d = 0.12345678912345678989;
		System.out.println(d);
		
		// 4byte 실수 : float
		
		float f = 0.123456789f;
		System.out.println(f);
		
		System.out.println(0.123456789123456789);
		System.out.println(0.123456789123456789f);		
		
	}

}
