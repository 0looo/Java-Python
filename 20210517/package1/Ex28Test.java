package package1;

public class Ex28Test {

	public static void main(String[] args) {
		Ex26 ex = new Ex26();
		ex.setNum1(20);
		ex.setNum2(10);
		System.out.println(ex.add());
		ex.setNum1(0);
		ex.setNum2(20);
		System.out.println(ex.div());  // ���ڰ� 0 �̸� ������ 0 : ����
		
		ex.setNum1(20);
		ex.setNum2(0);
		System.out.println(ex.div());  // �и� 0�̸� �Ұ��� : �Ҵ�
	}
}