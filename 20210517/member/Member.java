package member;

public class Member {
	int userNo;
	String userId;
	String userPw;
	String userName;
	int age;
	
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public int getUserNo() {
		return this.userNo;
	}
	public String getUserId() {
		return this.userId;
	}
}
