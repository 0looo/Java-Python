
/// 클래스 구성요소
/// 맴버필드
/// 생성자
public class Ex17 {
	// 맴버필드
	String name;
	int age;
	double height;

	// 오버로딩
	// 매개변수의갯수, 매개변수의 타입, 매개순서가 달라도 같은 이름의메서드를 만들 수 있음.
	public Ex17() {}
	public Ex17(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}

	public Ex17(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Ex17(String name) {
		this.name = name;
	}	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public double getHeight() {
		return this.height;
	}
}
