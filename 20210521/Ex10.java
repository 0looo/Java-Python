
public class Ex10 {
	public static void main(String[] args) {
		String str1 = "김연우";
		String str2 = new String("김연우");
		String str3 = "김연우";
		if(str1 == str2) {
			System.out.println("같다");
		}else{
			System.out.println("다르다");
		}
		if(str1 == str3) {
			System.out.println("같다");
		}else{
			System.out.println("다르다");
		}
		if(str1.equals(str2)) {
			System.out.println("같다");
		}else{
			System.out.println("다르다");
		}
	}
}
