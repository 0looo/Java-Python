
public class Ex12Test {

	public static void main(String[] args) {
		System.out.println(Ex11.idx);		// 10
		System.out.println(Ex11.value1);	// 20.5
		
		Ex11.val();
		System.out.println(Ex11.idx);
		System.out.println(Ex11.value1);
		
		Ex11.val(200, 10.23);
		System.out.println(Ex11.idx);
		System.out.println(Ex11.value1);
	}

}
// 정적 변수, 정적 메서드