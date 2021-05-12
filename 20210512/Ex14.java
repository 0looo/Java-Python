
public class Ex14 {

	public static void main(String[] args) {
		/// 배열
		/// 변수는 하나의 값을 저장하기 위한 공간
		/// 변수의 단점(하나에 하나값)을 보완하기 위한 타입
		int num0, num1, num2, num3;
		num0=1; num1=2; num2=3; num3=4;

		int [] num = {1,2,3,4};
		System.out.println("num[0] : " + num[0]);
		System.out.println("num[1] : " + num[1]);
		System.out.println("num[2] : " + num[2]);
		System.out.println("num[3] : " + num[3]);
		//////////////////
		
		for(int idx = 0; idx <=3 ; idx++) {
			System.out.println("num[" +idx+"] = " + num[idx]);
		}
		
		//각 요소에 값을 저장
		System.out.println(num[2]);
		num[2] = 10;
		System.out.println(num[2]);
	}

}
