
public class Ex17 extends Ex16{
	int k;
	// 부모 클래스에 생성자가 있다고 한다면 자식 클래스에 생성자가 있어야 한다.
	public Ex17(int i, int j, int k) {
		super(i, j); // 부모클래스의 생성자.
		this.k = k;
	}
	public void mul() {
		System.out.println(i*k);
	}
	public void div() {
		System.out.println(i/k);
	}
	
}