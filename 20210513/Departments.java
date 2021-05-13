
public class Departments {
	int deptNo;
	String deptName;
	String location;
	String manager;
	
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	
	public int getDeptNo() {
		return this.deptNo;
	}
	public String getDeptName() {
		return this.deptName;
	}
	public String getLocation() {
		return this.location;
	}
	public String getManager() {
		return this.manager;
	}
	
	public Departments() {}
	public Departments(int deptNo) {
		this.deptNo = deptNo;
	}
}
