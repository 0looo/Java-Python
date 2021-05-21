
public class Ex14 {
	public static void main(String[] args) {
		// 자바 문자열 함수(메서드)
		String str1 = "Java Programming";
		String str2 = "JAVA PROGRAMMING";
		
		System.out.println(str1.equals(str2));
		String lowerstr1 = str1.toLowerCase();
		String lowerstr2 = str2.toLowerCase();
		
		System.out.println(lowerstr1.equals(lowerstr2));
		String upperstr = str1.toUpperCase();
		System.out.println(upperstr);
		
		String str11 = String.valueOf(10);
		String str12 = String.valueOf(10.5);
		String str13 = String.valueOf(true);
	}

}
