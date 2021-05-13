
public class Ex13 {
	private String name;
	private int age;
	private double height;

	// 기본생성자
	public Ex13() {	}
	
	// 생성자 : 생성과 동시에 값 넣기
	// 생성자 이름 == class 이름
	public Ex13(String name, int age, double height) {
		this.age = age;
		this.height = height;
		this.name = name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public String getName() {
		return this.name;
	}
	public int getage() {
		return this.age;
	}
	public double getHeight() {
		return this.height;
	}
	
}
