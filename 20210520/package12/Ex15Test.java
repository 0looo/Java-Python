package package12;

import java.util.Scanner;

public class Ex15Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ex14 ex = new Ex14();
		System.out.print("나이를 입력하세요. : ");
		ex.setAge(sc.nextInt());
		System.out.print("키를 입력하세요 : ");
		ex.setHeight(sc.nextInt());
		try {
		System.out.println(ex.getAge());
		System.out.println(ex.getHeight());
		System.out.println(ex.getName().toString());
		}catch(NullPointerException e) {
			System.out.println("이름누락, 이름을 입력하세요.");
			ex.setName(sc.next());
			System.out.println(ex.getName());
		}
		
		sc.close();
	}

}
