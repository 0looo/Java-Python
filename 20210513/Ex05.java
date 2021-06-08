import java.util.Arrays;

public class Ex05 {

	public static void main(String[] args) {
		int [][] i = new int [3][];
		i[0] = new int[3];
		i[1] = new int[3];
		i[2] = new int[3];
		
		for(int x = 0; x<i.length; x++) {
			for(int y = 0; y<i[x].length;y++) {
				i[x][y] = x+y;
			}
		}
		
		for(int x = 0; x < i.length; x++) {
			for(int y = 0; y<i[x].length;y++) {
				System.out.println(i[x][y]);
			}
		}

		int [][]j = new int [3][];
		j[0] = new int[3];
		j[1] = new int[4];
		j[2] = new int[5];
		
		for(int x = 0; x<j.length; x++) {
			for(int y = 0;y<j[x].length;y++) {
				j[x][y] = x+ y;
			}
		}
		
		for(int x = 0; x < i.length; x++) {
			for(int y : j[x]) {
				System.out.println(y);
			}
		}
		
		System.out.println("==============");
		System.out.println(Arrays.deepToString(j));
	}

}
