package package12;

import java.util.Scanner;

public class Ex15Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ex14 ex = new Ex14();
		System.out.print("���̸� �Է��ϼ���. : ");
		ex.setAge(sc.nextInt());
		System.out.print("Ű�� �Է��ϼ��� : ");
		ex.setHeight(sc.nextInt());
		try {
		System.out.println(ex.getAge());
		System.out.println(ex.getHeight());
		System.out.println(ex.getName().toString());
		}catch(NullPointerException e) {
			System.out.println("�̸�����, �̸��� �Է��ϼ���.");
			ex.setName(sc.next());
			System.out.println(ex.getName());
		}
		
		sc.close();
	}

}
