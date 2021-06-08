package package1;

public class Ex28Test {

	public static void main(String[] args) {
		Ex26 ex = new Ex26();
		ex.setNum1(20);
		ex.setNum2(10);
		System.out.println(ex.add());
		ex.setNum1(0);
		ex.setNum2(20);
		System.out.println(ex.div());  // 분자가 0 이면 언제나 0 : 부정
		
		ex.setNum1(20);
		ex.setNum2(0);
		System.out.println(ex.div());  // 분모가 0이면 불가능 : 불능
	}
}