
public class Ex03 {

	public static void main(String[] args) {
		// �⺻ �ڷ��� : ����(byte, short, int, long), �Ǽ�, ����
		//			 boolean(�ο�) : True, False
		//				��� >> if, while���� �ַ� ����
		
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1);
		System.out.println(b2);
		
		String str = "true" ;
		System.out.println(str);  // b1�� str�� �ٸ���.(������¸� ����)
		
		int i = 10; // ����
		str = "10"; // ������
		
		// ���� �ڷ��� : String, �迭
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		
		// == �� �ǹ�  => �ּҸ� ����
		System.out.println(str1 == str2);  // str1�� str2�� �ּ� �� ((heap�� ���� �ּҺ�)
		System.out.println(str1 == str3);  // �ּҰ� �ٸ��� ������ False ���
		
		// �����ϱ����� ���� 
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		
		
		
	}

}
