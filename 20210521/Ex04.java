
public class Ex04 {
// 예외처리 : 오류 예외처리 : 오류가 발생하지 않은 것처럼 만든다.
// 오류가 발생하면 프로그램이 종료되므로 계속 실행하기 위해서 예외처리 실시.
	
	public static void main(String[] args) {
		int i [] = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		try {
			for (int j =0;j<=10;j++) {
				sum+=i[j];
			}}
		catch(ArrayIndexOutOfBoundsException e) {
			for (int j=0;j<i.length;j++){
				sum+=i[j];
			}
		}
		System.out.println(sum);

	}

}
