import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		// �ζ� ��ȣ ��±� (array�̿� x)
		List<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �ζ� ������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		while(num>0) {
			num--;
			for(int i = 1; i <= 45; i++) {
				list.add(i);
			}
			for(int i = 0; i<6;i++) {
				int idx = (int)(Math.random()*list.size());
				System.out.print(list.get(idx)+",");
				list.remove(idx);
			}
			System.out.println();
			list.clear();
		}
		sc.close();
	}

}
