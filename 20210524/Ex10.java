import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex10 {
	public static void main(String[] args) {
		Map<String, Student> map = new HashMap<String, Student>();
		map.put("highland0", new Student(1,"김철수"));
		map.put("highland1", new Student(2, "홍길동"));
		map.put("highland2", new Student(3, "아이유"));
		map.put("highland3", new Student(4, "이가부"));
		map.put("highland4", new Student(5, "박설격"));
		
		Student st = map.get("highland3");
		st.print();
		
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1, "아이유"));
		st = list.get(0);
		st.print();

	}

}
