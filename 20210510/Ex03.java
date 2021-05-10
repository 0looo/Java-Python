
public class Ex03 {

	public static void main(String[] args) {
		int i = 10;
		i = i - 1; // i = 10 - 1
		System.out.println(i);
		
		i = i - 1; // i = 9 - 1
		System.out.println(i);
		
		i = i - 1; // i = 8 - 1
		System.out.println(i);
		
		int j = 10;
		j--;  // j = j - 1;, j = 10 - 1
		System.out.println(j);
		j--;  // j = j - 1;, j = 9 - 1
		System.out.println(j);
		j--;  // j = j - 1;, j = 8 - 1
		System.out.println(j);
		
		int z = 10;
		--z;
		System.out.println(z);
		--z;
		System.out.println(z);
		--z;
		System.out.println(z);
		
		// --z 와 z--의 차이는 결국 없음.
	}

}
