
public class Ex03 {

	public static void main(String[] args) {
		// 2차원 배열 추가설명		
		int [] i1 = new int [3];
		int [] i2 = new int [3];
		int [] i3 = new int [] {1,2,3,4};
		int [][] i  = new int [3][];
		
		i[0] = i1;
		i[1] = i2;
		i[2] = i3;
		
		int [][] j = new int [3][];
		j[0] = new int [3];
		j[1] = new int [3];
		j[2] = new int [] {1,2,3,4};
		
		System.out.println(i[0][2]);
		
		int [] k = {1,2,3,4};
		int [][] k1 = {{1,2,3,4},{1,2,3,4},{1,2,3,4}};
		///				 k1[0]     k1[1]      k1[2]
		System.out.println(k1[0][0]);
		
		

	}

}
