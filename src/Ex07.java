
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
		// �Ǽ� : �ڸ����� �߿�(ũ�Ⱑ �߿����� ����)
		// 10^(-17)���� ��밡��
		
		double d = 0.12345678912345678989;
		System.out.println(d);
		
		// 4byte �Ǽ� : float
		
		float f = 0.123456789f;
		System.out.println(f);
		
		System.out.println(0.123456789123456789);
		System.out.println(0.123456789123456789f);		
		
	}

}
