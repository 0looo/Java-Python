
public class Ex32Test {

	public static void main(String[] args) {
		Ex31 ex1 = new Ex31();
		ex1.num1 = 10;
		ex1.num2 = 20;
		ex1.add();  // 부모 클래스
		ex1.div();	// 자식 클래스
		
		Ex30 ex = new Ex31();
		ex.num1 = 30;
		ex.num2 = 20;
		ex.add(); // 부모클래스
		// ex.div();  // 자식 클래스 불가능(자료형을 부모형으로 했기때문)
		
		Ex31 ex2 = (Ex31)ex;  // 참조 변수 형변환
		// 자식 객체의 내용을 사용하기 위해서는 자식 클래스로 형변환하면 된다.
		ex2.num1 = 30;
		ex2.num2 = 50;
		ex2.add();
		ex2.div();  // 자식클래스 사용가능 => 참조변수형변환
		// 참조 변수 형변환 : 부모 변수가 자식 객체를 참조하고 있을 때만 가능
		double d =10;
		int i = (int)d;
		System.out.println(i);
		
	}

}
