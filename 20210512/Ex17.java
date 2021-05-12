
public class Ex17 {

	public static void main(String[] args) {
		// 배열선언
		int i [] = {1,2,3,4};
		int i1 [] = new int[] {1,2,3,4};
		int i2 [] = new int[3];
		int i3 [];
		i3 = new int[3];
		
		// 배열 크기
		System.out.println("i배열의 크기 : " + i.length);
		for(int idx = 0; idx < i.length; idx++) {
			System.out.println(i[idx]);
		}
		
		int i4 [] = {1,2,3,4,5,6,7,3,1,4,1,5,56};
		int sum = 0;
		for(int idx = 0; idx < i4.length;idx++) {
			sum+=i4[idx];
		}
		System.out.println(sum);
		// for each
		for(int val : i4) {
			System.out.println(val);
		}
		
		String [] str1 = {"배고파","언제끝나","아직도 1시간남았다","저녁먹고싶다"};
		for(String str : str1) {
			System.out.println(str);
		}
	}
}