import java.util.ArrayList;
import java.util.List;

public class Ex04 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("아이고");
		list.add("푸루룩");
		list.add("java");
		System.out.println(list.size());
		
		// 내용추출
		System.out.println(list.toString());
		for (String s : list) {
			System.out.println(s);
		}
		
		list.add(1,"배고파");
		System.out.println(list.toString());
		
		// 원하는 index 출력
		System.out.println(list.get(2));
		list.remove(2);
		System.out.println(list.get(2));
		
		System.out.println(list.toString());
		list.add("배고파");
		System.out.println(list.toString());
		
		list.remove("배고파");
		System.out.println(list.toString());
		
		list.remove("123");
	}

}
