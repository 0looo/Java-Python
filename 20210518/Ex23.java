
public class Ex23 extends Ex22{
	public void add(int i, int j) {
		System.out.println(i+ j);
	}
	public void sub(int i, int j) {
		System.out.println(i-j);
	}
	
	// final 사용했기 때문에 override 불가.
	/*@Override
	public void div(int i, int j) {
		if (j==0) {
			System.out.println(0);
		}else {
			System.out.println(i/j);
		}
	}*/
}
