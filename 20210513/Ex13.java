
public class Ex13 {
	private String name;
	private int age;
	private double height;

	// �⺻������
	public Ex13() {	}
	
	// ������ : ������ ���ÿ� �� �ֱ�
	// ������ �̸� == class �̸�
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
