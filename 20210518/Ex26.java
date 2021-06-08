
public class Ex26 extends Ex25 {
	public void add(int i, int j) {
		System.out.println(i+j);
	}
	public void sub(int i, int j) {
		System.out.println(i-j);
	}
	@Override
	public void div(int i, int j) {
		if(j==0) {
			System.out.println(i);
		}else {
		System.out.println(i/j);}
	}
}

// 객체지향의 특징 : 캡슐화, 상속, 다형성