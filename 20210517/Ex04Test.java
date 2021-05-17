
public class Ex04Test {

	public static void main(String[] args) {
		Ex03 ex01 = new Ex03();
		ex01.age = 18;
		ex01.name = "이상범";
		// static(class변수)의 활용
		// 변수생성시 규칙적으로 변화될 경우 사용됨.
		// ex) num붙히는 방법
		Ex03.idx = Ex03.idx + 1;
		ex01.num = Ex03.idx;
		System.out.println(ex01.num);
		
		Ex03 ex02 = new Ex03();
		ex02.name = "이장범";
		ex02.age = 17;
		// numbering에 활용됨.
		Ex03.idx += 1;
		ex02.num = Ex03.idx;
		System.out.println(ex02.num);
		
		Ex03 ex03 = new Ex03();
		ex03.name = "김가이";
		ex03.age = 10;
		// numbering에 활용됨.
		Ex03.idx += 1;
		ex03.num = Ex03.idx;
		System.out.println(ex03.num);

		

	}

}
