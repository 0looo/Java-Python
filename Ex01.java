
public class Ex01 {

	public static void main(String[] args) {
		int [] i = {1,2,3,4};
		int [] i1 = new int [] {1,2,3,4};
		int [] i2 = new int[3];
		int [] i3;
		i3 = new int [3];
		
		double []d  = {1.2, 2.2};
		
		String [] str = {"배고파", "4시간남음"};
		String [] str1 = new String [] {"목말라","하하하"};
		String [] str2 = new String[3];
		str2[0] = "abc";
		str2[1] = "bbq";
		str2[2] = "bbc";
		
		for(int idx =0; idx < str2.length; idx++) {
			System.out.println(str2[idx]);
		}
		
		for(String s : str2) {
			System.out.println(s);
		}
	}

}
