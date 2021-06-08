import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		// lotto ������ 
		
		List<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.print("�ζ� ���� ������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		while(num > 0) {
			num --;
			for(int i = 1; i<= 45; i++) {
				list.add(i);
			}
			
			int [] lotto = new int[6];
			
			for(int i = 0; i < lotto.length; i++) {
				int idx = (int)(Math.random()*list.size());
				lotto[i] = list.get(idx);
				list.remove(idx);
			}
			Arrays.sort(lotto);
			System.out.println(Arrays.toString(lotto));
			list.clear();
			
		}
		sc.close();
	}
}
