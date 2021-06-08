
public class Ex21 {

	public static void main(String[] args) {
		for (int i = 1; i<=10; i++) {
			System.out.println(i);
		}
		
		int j = 1;
		for (; j<=10; j++) {
			System.out.println(j);
		}
		
		int x =1;
		for(;;) {
			if(x>10) break;
			System.out.println(x);
			x++;
		}
	}

}
