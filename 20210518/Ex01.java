
public class Ex01 {

	public static void main(String[] args) {
		Ex02 ex = new Ex02(10, 20);
		ex.print();
	}
}
class Ex02{
	int i;
	int j;
	public Ex02(int i, int j) {
		this.i = i;
		this.j = j;
	}
	public void print() {
		System.out.println(i);
		System.out.println(j);
	}
}
