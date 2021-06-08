
public class Ex09 {

	public static void main(String[] args) {
		int arr [] = new int[] {1,4,5,6,2,3};
		arrayTest(arr);
		arrayTest(new int[] {1,23,455,1,5,215,12});
		test(3,4,5);
	}
	public static void test(int ... a) {
		int sum = 0;
		for(int x :a) {
			sum+= x;
		}
		System.out.println(sum);
	}
	public static void arrayTest(int a []) {
		int sum = 0;
		for(int x :a) {
			sum+= x;
		}
		System.out.println(sum);
	}
}
