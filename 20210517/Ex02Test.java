
public class Ex02Test {

	public static void main(String[] args) {
		Ex01 ex1 = new Ex01();
		System.out.println(ex1.pi);
		System.out.println(ex1.i);
		System.out.println(ex1.d);
		System.out.println("==========");
		
		Ex01 ex2 = new Ex01();
		System.out.println(ex2.pi);
		System.out.println(ex2.i);
		System.out.println(ex2.d);
		System.out.println("==========");
		
		// stack의 값 : 각각의 heap에서 값을 바꾸기 때문에 ex1의 변경이 ex2에 영향을 미치지 않음
		ex1.i = 20;
		System.out.println(ex1.i);
		System.out.println(ex2.i);
		
		// static : 하나의 메모리를 공유함 => ex1의 수정이 ex2까지 영향을 미침.
		ex1.pi = 3.14;
		System.out.println(ex1.pi);
		System.out.println(ex2.pi);
		
		Ex01 ex3 = new Ex01();
		System.out.println(ex3.pi);
		
		System.out.println("Ex01 : " + Ex01.pi);
	}

}
