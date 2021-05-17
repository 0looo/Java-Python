package member.DAO;

import member.Member;

public class MemberDAO {
	Member member = new Member();
	public void test() {
		member.setUserId("highland0");
		member.setUserNo(12345);
		System.out.println(member.getUserId());
		System.out.println(member.getUserNo());
	}
	
}
