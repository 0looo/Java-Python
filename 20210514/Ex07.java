
public class Ex07 {

	public static void main(String[] args) {
		test(1,2,3,4,5);
		
		int i [] = new int[] {1,3,5,23,51};
		test1(i);
		test2(2);
	}

	// 인자값을 배열로 사용
	public static void test(int a,int b,int c,int d,int e) {
		int sum = 0;
		sum+= a;
		sum+= b;
		sum+= c;
		sum+= d;
		sum+= e;
		System.out.println(sum);
		}
	
	public static void test1(int [] i) { //int [] i  = new int[5];
		int sum = 0;
		for(int x : i) {
			sum+=x;
		}
		System.out.println(sum);
	}
	public static void test2(int i) {
		System.out.println(i);
	}
}
