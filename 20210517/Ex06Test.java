
public class Ex06Test {

	public static void main(String[] args) {
		Ex05 ex1 = new Ex05();
		Ex05.idx += 1;
		ex1.num = Ex05.idx;
		ex1.name = "김철수";
		ex1.getName();
		ex1.staticMethod();
		Ex05.staticMethod();	// 클래스명을 이용해서 메서드를 실행
		System.out.println(ex1.plus(10, 20));
		
		Ex05 ex2 = new Ex05();
		Ex05.idx += 1;	// 정적 변수
		ex2.num = Ex05.idx;
		ex2.name = "이박사";
		ex2.getName();
		ex2.staticMethod();
		Ex05.staticMethod();
		System.out.println(ex2.plus(20, 30));
		
		System.out.println(Ex05.plus(30, 40));
		
	}

}
