import java.util.Date;

public class Ex05 {
	public static void main(String[] args) {
		Date date = new Date();
		
		try {
			Class.forName("java.util.Date");
			System.out.println("class가 존재합니다.");}
		catch(ClassNotFoundException e) {
			System.out.println("class가 존재하지 않습니다.");
		}
		
		

	}

}
