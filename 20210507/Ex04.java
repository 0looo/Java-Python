
public class Ex04 {

	public static void main(String[] args) {
		// �ڵ� ����ȯ / ���� ����ȯ(overflow)
		byte b = -128;
		System.out.println(b);
		b= 127;
		System.out.println(b);
		
		short sh = -32768;
		System.out.println(sh);
		sh = 32767;
		System.out.println(sh);
		
		sh = b; // �ڵ� ����ȯ : ū �ڷ��� = ���� �ڷ���
		// byte < short < int < long  << float < double
		// ���� < �Ǽ�
		
		long l = 12345;
		float f = l;  // ������ �Ǽ��� ��ȯ��
		System.out.println(f);
		System.out.println(l);
		double d = f;
		System.out.println(d);
		// ��, �ڵ�����ȯ�� �⺻�ڷ��������� �����ϴ�.
		
	}

}
