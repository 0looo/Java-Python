
public class Ex09 {

	public static void main(String[] args) {
		// 1 ~ 100 합
		// for
		int result = 0;
		for(int i = 1; i<101; i++) {
			result += i;
		}
		System.out.println(result);
		
		//while
		result = 0;
		int i = 1;
		while(i<=100) {
			result+=i;
			i++;
		}
		System.out.println(result);
		
		///////////////////////////////
		result = 0;
		i = 1;
		while(true) {// : 무한루프
		result += i;
		i++;
		if(i==101) break;
		}
		System.out.println(result);
		
	}
}
