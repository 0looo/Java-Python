
public class Ex02 {

	public static void main(String[] args) {
		char ch = 'A'; // ch = 'abcd';
		String str = "abcd";
		// �ѱ��� �̻��� ���ڸ� ����� ��� String�̶�� �ڷ����� ����ϰ� ""��� ����Ѵ�
		
		System.out.println(ch);
		System.out.println(str);
		
		System.out.println();
		str = "";  // blank(����)
		System.out.println(str + 'a');

		str = " "; // ���鹮��
		System.out.println(str + 'a');
		
		ch = ' ';  // ���鹮�ڴ� ch���� ��밡��
		System.out.println(ch);
		// ch = '';   => error (���ڴ� ch�� ���� ����)
		
		// ���ڿ� ���� ������ (+)
		String firstName = "YG" ;
		String lastName = "Lee";
		System.out.println("Lee" + "YG");
		System.out.println(lastName+firstName);
		
		// ����, ���ڿ� ����  => '' �� "" ����
		System.out.println('A');  // ����
		System.out.println("A");  // ���ڿ�
		System.out.println('��');  // ����
		System.out.println("��");  // ���ڿ�
		

		
		
		
	}

}
