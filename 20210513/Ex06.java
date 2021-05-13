import java.util.Arrays;

public class Ex06 {

	public static void main(String[] args) {
		// 2차원 배열 선언
		int [][] i = new int [3][];
		i[0] = new int[3];
		i[1] = new int[4];
		i[2] = new int[5];
		
		int [][] j = {{1,2,3,4},{1,2,3},{1,2,3,4,5}};
		
		int [][] k = new int [3][];
		k[0] = new int [4];
		k[1] = new int [4];
		k[2] = new int [4];
		// k를 간단하게 생성
		int [][] l = new int [3][4];
		
		for(int x = 0; x<l.length;x++) {
			for(int y=0; y<l[x].length;y++) {
				l[x][y] = x+y;
			}
		}
		
		System.out.println(Arrays.deepToString(l));

		/// for each
		for(int [] z : l) {
			for(int w : z) {
				System.out.println(w);
			}
		}
	}

}
