import java.util.Date;

public class Ex06 {

	public static void main(String[] args) {
		String name = "LeeYK";
		int age = 31;
		double height = 177.0;
		System.out.println("���� �̸���"+ name + ", ���̴�" + age + ", Ű��" + height + "�Դϴ�.");
		
		// printf Ȱ��
		// printf�� �ڵ��ٹٲ��� ���� ����. ���� \n�� ������� ��.
		System.out.printf("���� �̸��� %s�̰�, ���̴� %d, Ű�� %f�Դϴ�. \n", name, age, height);
		System.out.printf("���� �̸��� %s�̰�, ���̴� %d, Ű�� %.1f�Դϴ�. \n", name, age, height);
		System.out.printf("���� �̸��� %s�̰�, ���̴� %d, Ű�� %d�Դϴ�. \n", name, age, (int)height);
		
		// format ���� : %s(���ڿ�), %d(����), %f(�Ǽ�), %c(����), %b(bool)
		System.out.println("======================");
		System.out.printf("���� �̸��� %s�Դϴ�. ���̴� %d�Դϴ�. \n", name, age);
		
		// ��°��� ���� �� ���ĺ���
		System.out.printf("���� �̸��� %10s�Դϴ�. ���̴� %10d�Դϴ�. \n", name, age);
		// ������ڴ� ������ ����
		
		System.out.printf("���� �̸��� %-10s�Դϴ�. ���̴� %-10d�Դϴ�. \n", name, age);
		// �������ڴ� ���� ����
		
		System.out.printf("����� �ѱ�����̸� %b�Դϴ�. \n", true);
		System.out.printf("����� �ѱ�����̸� %b�Դϴ�. \n", 0);  // %b �ڸ��� ���� ������ true 
		System.out.printf("����� �ѱ�����̸� %b�Դϴ�. \n", null); // null�϶��� false
		
		// ������� 
		System.out.printf("%4s \n","hello java");  // ������ѵ��� ����
		System.out.printf("%4s \n","hi");  // ������ѵ��� ����
		System.out.printf("%4.2s \n","hello java");  // 4�ڸ� �� ���� 2�ڸ����� 2��ǥ��
		System.out.printf("%4.2f \n", 1234567.123456);
		
		// Date => import util : ���� ��¥ ��� 
		Date date = new Date();
		System.out.println(date);
		// %tH : �ð�, %tM : ��, %tS : �� 
		// %tA : ����, %tB, %tm : ��, %tY : ����, %td : ����
		System.out.printf("���� �ð��� %tH, ���� %tM, �ʴ� %tS�Դϴ�. \n", date, date, date);
		System.out.printf("������ %tA, ���� %tB, �⵵�� %tY�⵵, ���� %td�� �Դϴ�. \n", date, date, date, date);
		
	}

}
