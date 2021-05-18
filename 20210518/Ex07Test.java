
public class Ex07Test {

	public static void main(String[] args) {
		int j = 10;	// 기본 자료형 : stack영역에 만들어짐
		test(j);
		System.out.println(j);
		
		j = test1(j);
		System.out.println(j);
	}
	public static void test(int i) {
		i = 100;
		System.out.println(i);
	}
	public static int test1(int i1) {
		i1 = 1000;
		return i1;
	}
}
