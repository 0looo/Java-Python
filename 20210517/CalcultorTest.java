
public class CalcultorTest {

	public static void main(String[] args) {
		// static ������ �ƴҰ�� => �׻� ��ü������ �ؼ� ����ؾ���.
		Calculator ex = new Calculator();
		ex.plus(10, 20);
		
		Calculator ex1 = new Calculator();
		ex1.plus(20,30); 
		// ��ü������ �������� 
		// �ذ��� : static �޼��带 ����ؼ� �����.
	}

}
