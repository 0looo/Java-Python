import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		String str = "나는 자바가 재미있습니다.";
		String [] strs = str.split(" ");
		System.out.println(Arrays.toString(strs));
		
		String str1 = "나는/자바가/재미있습니다.";
		strs = str1.split("/");
		System.out.println(Arrays.toString(strs));
		
		String text = "아이야&가깅,게임기,아이구=배고파";
		strs = text.split("&|,|=");
		System.out.println(Arrays.toString(strs));
		for(String s : strs) {
			System.out.println(s);
		}
		
	}

}
