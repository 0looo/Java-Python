// 부서 정보 정리
public class Employees {
	int emptNo;
	String emptName;
	String location;
	int managerId;
	
	/// Class 구성요소
	/* 멤버필드
	 * 생성자
	 * 매서드
	 */
	// setter
	//						 매개변수
	public void setEmptNo(int emptNo) {
		this.emptNo = emptNo;
	}
	public void setEmptName(String emptName) {
		this.emptName = emptName;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	
	// getter
	public int getEmptNo() {
		return this.emptNo;
	}
	public String getEmptName() {
		return this.emptName;
	}
	public String getLocation() {
		return this.location;
	}
	public int getManagerId() {
		return this.managerId;
	}
	
	
	// 생성자
	// 기본생성자
	public Employees() {}
	
	public Employees(int emptNo, String emptName, String location, int managerId) {
		this.emptNo = emptNo;
		this.emptName = emptName;
		this.location = location;
		this.managerId = managerId;
	}
	
}
