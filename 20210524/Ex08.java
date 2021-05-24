import java.util.Arrays;
import java.util.List;

public class Ex08 {
	public static void main(String[] args) {
		String [] str = {"홍길동", "신용재","나얼"};
		List<String> list = Arrays.asList("홍길동", "신용재","나얼");
		
		System.out.println(Arrays.toString(str));
		System.out.println(list.toString());

	}

}
