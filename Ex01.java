
public class Ex01 {

	public static void main(String[] args) {
		//  										4byte    8byte
		// ���ͳ� : �ڿ��� : ����    : 10, 1, 2, ....    : int,     long
		//      		 �Ǽ�    : 0.5, 1.3 ...   	  : float, double
		//				 ����    : 'A', 'B',...		  : char
		//			 	 ���ڿ�  : "as". "asdf" ...  : string
		// ���� �������� �⺻ũ�� : 4byte
		System.out.println(Integer.MAX_VALUE);  // �ִ� 2147483647
		System.out.println(Integer.MIN_VALUE);  // �ּ� -2147483648
		// System.out.println(-2147483649);    =>  error(���� �� ����)
		// System.out.println(2147483647);		=> error
		
		// �ذ���
		System.out.println(-2147483649L);   // L�� ������ long���� ���
		
		// �Ǽ� ������ �⺻ũ�� : 8 byte : 10^(-17) ���� ǥ������ , ���� �ڸ��� ����ó�� 
		System.out.println(0.123456789123456789);   
		
		// ���� ���̴� ��� (float�� ǥ��)
		System.out.println(0.123456789123456789F);  // f�� ���� ���, 8�ڸ����� ǥ��, 9��° �ݿø� ó�� 
		// �Ǽ��� ũ��� ��Ȯ���� �ǹ�
		
		// ��½� �ڿ��� ��� ����õ   =>  ��������ؼ� ���
		System.out.println(10);
		
		// ��������
		int i = 10;  // �ڷ��� ���� ����
		// i = 10.5; => error(int�� �ƴ� �ڿ���)
		System.out.println(i);
		
		double d = 10.5;
		// d ="abcd" => error
		System.out.println(d);
		
		char ch = 'A';
		System.out.println(ch);
		
		String str = "abc";
		System.out.println(str);
		
		//  ���� ����, �ʱⰪ, ����
		int i = 10;
		System.out.println(i);
		
		int j;
		// System.out.println(j);  // error = initialized
		j = 10;
		System.out.println(j);
		
		j = 20;
		System.out.println(j);
	
		
	}

}
