
public class Ex05 {
	static int idx = 0;  // ���� ����
	int num;
	String name;
	
	public static void staticMethod() {  // �����޼���
		System.out.println("���� �޼���");
	}
	
	public void getName() {  // �Ϲ� �޼���
		System.out.println(idx);
		System.out.println(this.num);
		System.out.println(this.name);
	}

	public static int plus(int num1, int num2) { // ���� �޼���  =>��ü ������ �ʿ䰡 ����
		return num1 + num2;
	}
	
	
}
