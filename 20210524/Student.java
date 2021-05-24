public class Student {
	public int sno;
	public String name;
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	public void print() {
		System.out.println(sno +" " + name);
	}
}
