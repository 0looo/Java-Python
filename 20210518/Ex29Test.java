// 객체지향의 다향성 설명

public class Ex29Test {

	public static void main(String[] args) {
		Ex27 ex27;  // 부모 변수
		Ex28 ex = new Ex28();
		Ex28 ex1 = new Ex28();
		
		ex.num1 = 10;
		ex.num2 = 20;
		ex1.num1 = 100;
		ex1.num2 = 200;
		
		Ex28 ex2 = new Ex28();
		ex2.num1=20;
		ex2.num2=30;
		
		ex27 = ex;	//1
		System.out.println(ex27.num1);
		System.out.println(ex27.num2);
		
		ex27 = ex1;	//2
		System.out.println(ex27.num1);
		System.out.println(ex27.num2);
		
		ex27 = ex2;	//3
		System.out.println(ex27.num1);
		System.out.println(ex27.num2);
	}

}
