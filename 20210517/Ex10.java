
public class Ex10 {
	static int idx;	// static ������ �ʱⰪ�� �⺻���̴�.
	// static ���� �ʱ�ȭ ���
	// 1. ������
	// 2. static �� �̿�
	static {
			idx = 10;	// static ������ 10���� �ʱ�ȭ.
			// i = 20;  // �ν��Ͻ� ������ �ʱ�ȭ �Ұ�
	}
	// 3. setter (�ν��Ͻ� ���� ���� ����)
		// 1) ������
	public Ex10(int idx, int i) {
		this.i = i;	// �ν��Ͻ� ����
		this.idx = idx;	// ���� ����
	}
		// 2) setter
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public void setI(int i) {
		this.i = i;
		}
		
		// default ������
	public Ex10() {}
		
	static void setVal(int idx1) {
		idx = idx1;	// static �ȿ����� this�� ����� �� ����.
					// ������ �Ű������� �̸��� �ٸ��� ǥ��.
	}
	
	
	int i;			// �ν���Ʈ �������� �ʱⰪ�� �⺻���̴�.
	// �ν��Ͻ� ���� �ʱ�ȭ ��� : setter, ������
	
	public void test() {
		int j = 0;	// ���� ������ �ʱⰪ�� ���� ����.
		System.out.println(j);	// initialized error
								
	}
}
