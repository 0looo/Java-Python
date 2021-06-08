// 추상 메서드는 재정의 되지 않았을 경우 사용불가
// 따라서 객체생성이 불가하다.
public abstract class Ex25 {
	public void mul(int i, int j) {
		System.out.println(i*j);
	}
	// abstract : 무조건 재정의 해서 사용
	// 추상메서드 : 자식 클래스에서 재정의해서 사용해야 하는 메서드
	
	public abstract void div(int i, int j);

}
