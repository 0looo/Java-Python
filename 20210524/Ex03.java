import java.util.StringTokenizer;

public class Ex03 {
	public static void main(String[] args) {
		// ���ڿ��� ��ū���� ����
		String text = "ȫ�浿 �̼�ȫ �ڿ���";
		StringTokenizer st = new StringTokenizer(text);
		int cnt = st.countTokens();
		for (int i =0;i<cnt;i++) {
			String str = st.nextToken();
			System.out.println(str);
		}
		
		text = "��ö��/�ڿ���,�̰���";
		StringTokenizer st1 = new StringTokenizer(text,"/|,");
		while(st1.hasMoreTokens()) {
			String str = st1.nextToken();
			System.out.println(str);
		}
		
	}

}
// charAt(idx) : Ư���ε��� ���� ��������
// indexOf(ch) : Ư�������� index�� ����
// length() : ���ڿ��� ������ ����
// replace("old","new") : ���ڿ� �ٲٱ�
// substring(���� index, ���� + ���� ���ڼ�) : ���ڿ� �ڸ���
// toLowerCase() : �ҹ��ڷ� ����
// toUpperCase() : �빮�ڷ� ����
// String.valueOf(letteral) : ���ڰ� �ƴ� ���ͳ������ڿ���
// getBytes() : ���ڿ��� ����Ʈ�� ��ȯ