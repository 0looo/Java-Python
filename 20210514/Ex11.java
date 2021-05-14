
public class Ex11 {

	public static void main(String[] args) {
		sum(1,200);
		sum(200);
		sum();
	}

	public static void sum(int start, int end) {
		int sum = 0;
		for(int i=start;i<=end;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
	public static void sum(int end) {
		int sum=0;
		for(int i = 1; i<=end; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
	public static void sum() {
		int sum =0;
		for(int i =0;i<=100;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
}
