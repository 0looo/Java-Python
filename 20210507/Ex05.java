
public class Ex05 {

	public static void main(String[] args) {
		// ���� ����ȯ : ���� �ڷ��� = (���� �ڷ���)ū �ڷ���
		// double > float > long > int > short > byte 
		
		// ex
		long l = 10;
		int i = (int)l;
		System.out.println(i);
		
		l = -2147483648;
		i = (int)l;
		System.out.println(l);
		
		// �����÷ο� = ���� ����ȯ���� ũ�⿡ ������ ���� ��� ���� ���Ѵ�.
		// ex
		l = -2147483649L;
		i = (int)l;
		System.out.println(i);
		// ���� ����ȯ�� ��� �����÷ο� ���������.
		
		float f = 10;  // �ڵ� ����ȯ : 10.0
		System.out.println(f);
		f = 12.664566665f;
		i = (int)f;  // �Ǽ��� ������ ����ȯ�� �������� ������.(�Ҽ��ڸ� ����)
		// Ȱ�� : �� ���Ҷ� ���� ���
		System.out.println(f);
		System.out.println(i);
		
		System.out.println(10.0 % 3.0); // (10 / 3) �� ������
		System.out.println(10 % 3);
		System.out.println((int)(10.0 / 3.0));  // (10 / 3)�� ��
		// ����
		System.out.println((int)10.0/3.0);  // int�� ���η� ���� ���� ��� 10.0�� int�� �����.
		
	}

}
