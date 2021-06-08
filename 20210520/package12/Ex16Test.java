package package12;
public class Ex16Test {
	public static void main(String[] args) {
		try{Class.forName("aaaa");
			System.out.println("class가 존재합니다.");;
		}catch(ClassNotFoundException e){
			System.out.println("class가 존재하지 않습니다.");
		}
	}

}
