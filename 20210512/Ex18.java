import java.util.Arrays;

public class Ex18 {

	public static void main(String[] args) {
		int i []= {1,2,3,4,5};
		System.out.println(i[0]);
		System.out.println(i);
		String str = "배고파";
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
		
		System.out.println(Arrays.toString(i));
	}

}
