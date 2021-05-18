import java.util.Arrays;

public class Ex09Test {

	public static void main(String[] args) {
		int i = test1();
		Ex08 ex = test();
		ex.print();
		int [] i1 = test2();
		System.out.println(Arrays.toString(i1));
	}
	public static Ex08 test() {
		Ex08 ex = new Ex08();
		ex.setI(10);
		ex.setJ(20);
		return ex;
	}
	public static int test1() {
		return 1;
	}
	
	public static int [] test2() {
		int [] i = {1,2,3,4,5,6};
		return i;
	}
}
