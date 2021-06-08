
public class Ex01 {
	public static void main(String[] args) {
		// 공백문자 제거  : trim()
		String tel1 = "    02";
		System.out.println(tel1);
		System.out.println(tel1.trim());
		
		String tel2 = "02    ";
		System.out.println(tel2);
		System.out.println(tel2.trim());
		
		String tel3 = "   02    ";
		System.out.println(tel3);
		System.out.println(tel3.trim());
		
		String tel4 = "    0  2    ";
		System.out.println(tel4);
		System.out.println(tel4.trim());
	}

}
