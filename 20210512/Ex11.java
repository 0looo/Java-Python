
public class Ex11 {

	public static void main(String[] args) {
		// 1~ 100까지 합
		// for
		int result = 0; 
		for(int i = 1; i <101; i++) {
			result += i;
		}
		System.out.println(result);
		////////////////////////////
		// 1~ 100의 홀수합
		result = 0;
		for(int i = 1; i<101; i++) {
			if(i%2==0)continue;
			result +=i;
		}
		System.out.println(result);

		// 1~ 100의 짝수합
		result = 0;
		for(int i = 1; i<101; i++) {
			if(i%2!=0)continue;
			result +=i;
		}
		System.out.println(result);
		
	}

}
