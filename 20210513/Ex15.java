
public class Ex15 {
	String name;
	int age;
	double height;
	public Ex15(String name, int age, double height) {
		this.age = age;
		this.height = height;
		this.name = name;
	}
	
	//getter
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public double getHeight() {
		return this.height;
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
