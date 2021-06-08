
public class Ex04 {

	public static void main(String[] args) {
		int result = add(5,10);		// 호출메서드
		System.out.println(result);
		Tv ex = new Tv();
		ex.channelDown();
		
	}
	
	static int add(int i, int j) {
		return i +j ;	// 반환값은 호출 메서드로 반환
		
	}
}
