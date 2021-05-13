
public class Ex02 {

	public static void main(String[] args) {
		int i1[] = {1,2,3,4,5};
		int i2[] = {11,22,33,44,55};
		int i3[] = {12,13,14,15,16};
		
		// 2차원 배열
		int [][] i = new int [3][];
		i[0] = i1;
		i[1] = i2;
		i[2] = i3;
		
		System.out.println(i[0]);  // 1차원 표기법
		System.out.println(i[0][0]);  // 2차원 표기법
		
		System.out.println(i.length);  // 2차원 배열의 1차원 배열 갯수
		System.out.println(i[0].length);  // 0행에 있는 열의 갯수
	}

}
