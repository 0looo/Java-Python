import java.io.UnsupportedEncodingException;

public class Ex11 {

	public static void main(String[] args) {
		String str = "안녕하세요";
		String str1 = "abcde";
		byte[] bytes1 = str.getBytes();
		byte[] bytes2 = str1.getBytes();
		System.out.println(str.length());
		System.out.println(str1.length());
		
		System.out.println("bytes1.length : " + bytes1.length);
		System.out.println("bytes2.length : " + bytes2.length);
		// utf-8: 한글은 한글자에 3byte, 영어는 1byte		
		
		try {
			byte[] bytes3 = str.getBytes("euc-kr");
			System.out.println("bytes3.length : " +bytes3.length);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		// euc-kr : 한글은 한글자에 2byte, 영어는 1byte
	}

}
