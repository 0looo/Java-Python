
public class Ex10Test {

	public static void main(String[] args) {
		System.out.println(Ex10.idx);
		Ex10 ex = new Ex10();
		System.out.println(ex.i);
		ex.test();
		
		Ex10 ex1 = new Ex10();
		System.out.println(Ex10.idx);
		// static 블럭은 객체 생성시에 실행이 되서 정적변수를 초기화한다.
		
		Ex10 ex2 = new Ex10(20, 10);
		System.out.println(ex2.idx);
		ex2.setIdx(30);	//setter 사용 초기화
		System.out.println(ex2.idx);
		
		Ex10.setVal(1000);
		System.out.println(Ex10.idx);

	}

}
