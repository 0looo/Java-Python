
public class Ex13 {

	public static void main(String[] args) {
		String ssn = "880815-1234567";
		System.out.println(ssn.substring(1,6));
		
		//index.nhn 출력
		String url = "http://localhost::8080/main/index.nhn";
		String context = "/main";
		int i = url.indexOf(context);
		String command = url.substring(i+5);
		System.out.println(command);
	}
}
