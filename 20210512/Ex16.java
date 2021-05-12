
public class Ex16 {

	public static void main(String[] args) {
		// 배열을 만드는 유형
		int i [] = {10, 20, 30};
		int [] i1 = {1,2,3};
		int i2 [];
		i2 = new int[3]; // 나중에 값을 넣어줄때는 new와 크기를 정해줘야함.
		
		i2[0] = 11;
		i2[1] = 22;
		i2[2] = 33;
		for(int idx = 0; idx <=2; idx ++){
			System.out.println(i2[idx]);
		}
		
		int i3 [] = new int[3];
		i3[0] = 10;
		i3[1] = 20;
		i3[2] = 30;
		
		int i4 [] = new int[3];
		System.out.println(i4[0]);
		System.out.println(i4[1]);
		System.out.println(i4[2]);
		
		long [] l  = new long[3];
		System.out.println(l[1]);
		
		float [] f  = new float[3];
		System.out.println(f[1]);
		
		double [] d = new double[3];
		System.out.println(d[0]);
		
		boolean b [] = new boolean[3];
		System.out.println(b[1]);
		
		String str [] = new String[3];
		System.out.println(str[1]);

	}

}
