import java.util.HashMap;
import java.util.Map;

public class Ex09 {
	public static void main(String[] args) {
		// Map<key,value>
		// 값출력시 index사용 x
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("아이유", 80);
		map.put("1번", 1);
		map.put("2번", 2);
		map.put("1번", 10);  // update
		System.out.println(map.size());
		System.out.println(map.get("1번"));
		System.out.println(map.keySet());
		
		System.out.println(map.toString());
		System.out.println(map.get("3번"));
		
		System.out.println(map.containsKey("3번"));

	}

}
