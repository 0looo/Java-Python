import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex10 {
	public static void main(String[] args) {
		Map<String, Student> map = new HashMap<String, Student>();
		map.put("highland0", new Student(1,"��ö��"));
		map.put("highland1", new Student(2, "ȫ�浿"));
		map.put("highland2", new Student(3, "������"));
		map.put("highland3", new Student(4, "�̰���"));
		map.put("highland4", new Student(5, "�ڼ���"));
		
		Student st = map.get("highland3");
		st.print();
		
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1, "������"));
		st = list.get(0);
		st.print();

	}

}
