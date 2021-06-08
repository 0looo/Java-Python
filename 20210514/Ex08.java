
public class Ex08 {

	public static void main(String[] args) {
		int i =2;
		test(i);
		fullName("Kim","Kang");
		int [] ai = new int[] {1,2,3,4,5};
		arrayTest(ai);
		
	}
	
	
	public static void test(int j) {
		System.out.println(j);
	}
	public static void fullName(String firstName, String lastName) {
		System.out.println(lastName + firstName);
	}
	public static void arrayTest(int i []) {
		int sum = 0;
		for(int x:i) {
			sum+=x;
		}
		System.out.println(sum);
	}
}
