
/// Ŭ���� �������
/// �ɹ��ʵ�
/// ������
public class Ex17 {
	// �ɹ��ʵ�
	String name;
	int age;
	double height;

	// �����ε�
	// �Ű������ǰ���, �Ű������� Ÿ��, �Ű������� �޶� ���� �̸��Ǹ޼��带 ���� �� ����.
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
