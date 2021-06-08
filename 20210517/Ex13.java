// 상수 : 변하지 않는 수 : 고정값을 갖는 수
// 변수 : 변하는 수 : 고정되지 않은 수.
public class Ex13 {
	static final double PI = 3.141592;
	static int i;
	public static void main(String [] args) {
		// 변수
		i = 10;
		System.out.println(i);
		i = 20;
		System.out.println(i);
		
		// 상수
		System.out.println(10);
		System.out.println("사과");
		// 리터널은 모두 상수.
		
		//PI = 3.14;	//상수
		//System.out.println(PI);	// cannot be assigned  
		
	}
}
