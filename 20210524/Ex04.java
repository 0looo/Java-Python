import java.util.ArrayList;
import java.util.List;

public class Ex04 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("���̰�");
		list.add("Ǫ���");
		list.add("java");
		System.out.println(list.size());
		
		// ��������
		System.out.println(list.toString());
		for (String s : list) {
			System.out.println(s);
		}
		
		list.add(1,"�����");
		System.out.println(list.toString());
		
		// ���ϴ� index ���
		System.out.println(list.get(2));
		list.remove(2);
		System.out.println(list.get(2));
		
		System.out.println(list.toString());
		list.add("�����");
		System.out.println(list.toString());
		
		list.remove("�����");
		System.out.println(list.toString());
		
		list.remove("123");
	}

}
