import java.util.HashMap;
import java.util.Map;

public class Ex09 {
	public static void main(String[] args) {
		// Map<key,value>
		// ����½� index��� x
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("������", 80);
		map.put("1��", 1);
		map.put("2��", 2);
		map.put("1��", 10);  // update
		System.out.println(map.size());
		System.out.println(map.get("1��"));
		System.out.println(map.keySet());
		
		System.out.println(map.toString());
		System.out.println(map.get("3��"));
		
		System.out.println(map.containsKey("3��"));

	}

}
