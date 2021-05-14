
public class Ex01 {

	public static void main(String[] args) {
		Employees emp = new Employees();  // default 생성자
		emp.setEmptNo(101);
		emp.setEmptName("영업부");
		emp.setLocation("123456");
		emp.setManagerId(1001);
		System.out.println(emp.getEmptName());
		System.out.println(emp.getEmptNo());
		System.out.println(emp.getLocation());
		System.out.println(emp.getManagerId());

		Employees emp1 = new Employees(101, "영업부", "234567", 1002);
		System.out.println(emp1.getEmptName());
		System.out.println(emp1.getEmptNo());
		System.out.println(emp1.getLocation());
		System.out.println(emp1.getManagerId());
	}

}
