import java.util.Arrays;

public class Ex21 {

	public static void main(String[] args) {
		int i [] = new int[20];
		for(int idx=0;idx<i.length;idx++) {
			i[idx]=idx+1;
		}
		System.out.println(Arrays.toString(i));
		
		for(int j=0;j<=100;j++) {
			int idx =(int)(Math.random()*20);
			int temp = i[0];
			i[0] = i[idx];
			i[idx]=temp;
		}
		System.out.println(Arrays.toString(i));
	}

}
