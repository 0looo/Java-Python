package package1.package2;

public class Ex25 {
	// ���� ������
	protected int num1;
	protected int num2;
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public int mul() {
		return num1 * num2;
	}
	
	public int div() {
		if(num2==0) {
			return 0;
		}else {
		return num1 / num2;
		}
	}
	
}

// ���� ���� : static int i = 10;	// ��ü�� �����ؼ� ����ϴ� ������
// ��� : �Ϲ� ��� final int i = 10
//		 ���� ��� static final int i = 10;

// �ʱ�ȭ
// �Ϲ� ��� : ������
// ���� ��� : static ��

// ��ü������ Ư¡ : ĸ��ȭ, ��� : �������̵�