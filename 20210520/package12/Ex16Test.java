package package12;
public class Ex16Test {
	public static void main(String[] args) {
		try{Class.forName("aaaa");
			System.out.println("class�� �����մϴ�.");;
		}catch(ClassNotFoundException e){
			System.out.println("class�� �������� �ʽ��ϴ�.");
		}
	}

}
