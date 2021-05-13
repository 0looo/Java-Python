
public class Ex04 {

	public static void main(String[] args) {
		int [][] i = new int[3][];
		i[0] = new int[3];
		i[1] = new int[3];
		i[2] = new int[3];
		
		int [] j1 = new int [3];
		int [] j2 = new int [4];
		int [] j3 = new int [5];
		
		int [][] j = new int [3][];
		j[0] = j1;
		j[1] = j2;
		j[2] = j3;
		
		int [][] k = new int[3][];
		k[0] = new int [3];
		k[1] = new int [4]; 
		k[2] = new int [5];
		
		System.out.println(k[0].length);
		System.out.println(k[2].length);
		
		int [][] l = new int [3][];
		l[0] = new int[] {1,2,3};
		l[1] = new int[] {4,5,6};
		l[2] = new int[] {7,8,9};
		
		for(int idx = 0; idx<l.length;idx++) {
			for(int idx1 =0; idx1<l[idx].length; idx1++) {
				System.out.println(l[idx][idx1]);
			}
		}
	}

}
