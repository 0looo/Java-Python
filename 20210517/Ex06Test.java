
public class Ex06Test {

	public static void main(String[] args) {
		Ex05 ex1 = new Ex05();
		Ex05.idx += 1;
		ex1.num = Ex05.idx;
		ex1.name = "��ö��";
		ex1.getName();
		ex1.staticMethod();
		Ex05.staticMethod();	// Ŭ�������� �̿��ؼ� �޼��带 ����
		System.out.println(ex1.plus(10, 20));
		
		Ex05 ex2 = new Ex05();
		Ex05.idx += 1;	// ���� ����
		ex2.num = Ex05.idx;
		ex2.name = "�̹ڻ�";
		ex2.getName();
		ex2.staticMethod();
		Ex05.staticMethod();
		System.out.println(ex2.plus(20, 30));
		
		System.out.println(Ex05.plus(30, 40));
		
	}

}
