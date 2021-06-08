
public class Ex02 {
	public static void main(String[] args) {
		String str = "12345";
		String str1 = "a12345";
		int result ;
		try{
			result = Integer.parseInt(str) + Integer.parseInt(str1);}
		catch(NumberFormatException e) {
			System.out.println("문자가 존재합니다.");
			str1 = "23456";
			result = Integer.parseInt(str) + Integer.parseInt(str1);
		}
		System.out.println(result);
		

	}

}
