
public class Ex06Test {
	public static void main(String[] args) {
		EX05 ex = new EX05();
		EX05 ex1 = ex;
		ex.i = 10;
		System.out.println(ex.i);
		ex1.j = 20;
		
		EX05 ex2 = new EX05();
		System.out.println(ex2.i);
		
		int i = 1;
		int j = i;
		test1(i);
		test(ex);
		System.out.println(ex.i);
		
	}
						// 참조형 매개변수
	public static void test(EX05 ex3) { // EX05 ex3 = ex;
		ex3.i = 100;
		
	}
	public static void test1(int i) {
		System.out.println(i);
	}
}
