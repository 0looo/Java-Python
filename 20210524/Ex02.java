import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		String str = "���� �ڹٰ� ����ֽ��ϴ�.";
		String [] strs = str.split(" ");
		System.out.println(Arrays.toString(strs));
		
		String str1 = "����/�ڹٰ�/����ֽ��ϴ�.";
		strs = str1.split("/");
		System.out.println(Arrays.toString(strs));
		
		String text = "���̾�&����,���ӱ�,���̱�=�����";
		strs = text.split("&|,|=");
		System.out.println(Arrays.toString(strs));
		for(String s : strs) {
			System.out.println(s);
		}
		
	}

}
