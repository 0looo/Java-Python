
public class Ex02Test {

	public static void main(String[] args) {
		Ex01 ex1 = new Ex01();
		System.out.println(ex1.pi);
		System.out.println(ex1.i);
		System.out.println(ex1.d);
		System.out.println("==========");
		
		Ex01 ex2 = new Ex01();
		System.out.println(ex2.pi);
		System.out.println(ex2.i);
		System.out.println(ex2.d);
		System.out.println("==========");
		
		// stack�� �� : ������ heap���� ���� �ٲٱ� ������ ex1�� ������ ex2�� ������ ��ġ�� ����
		ex1.i = 20;
		System.out.println(ex1.i);
		System.out.println(ex2.i);
		
		// static : �ϳ��� �޸𸮸� ������ => ex1�� ������ ex2���� ������ ��ħ.
		ex1.pi = 3.14;
		System.out.println(ex1.pi);
		System.out.println(ex2.pi);
		
		Ex01 ex3 = new Ex01();
		System.out.println(ex3.pi);
		
		System.out.println("Ex01 : " + Ex01.pi);
	}

}
