
public class CalcultorTest {

	public static void main(String[] args) {
		// static 변수가 아닐경우 => 항상 객체생성을 해서 사용해야함.
		Calculator ex = new Calculator();
		ex.plus(10, 20);
		
		Calculator ex1 = new Calculator();
		ex1.plus(20,30); 
		// 객체생성이 귀찮아짐 
		// 해결방법 : static 메서드를 사용해서 사용함.
	}

}
