
public class Ex03 {
	public static void main(String[] args) {
		String lastName = "lee";
		String firstName = null;
		try {
			System.out.println(lastName + firstName.toString());
		}catch(NullPointerException e) {
			firstName = "yk";
			System.out.println(lastName + firstName.toString());
		}
		
		
				

	}

}
