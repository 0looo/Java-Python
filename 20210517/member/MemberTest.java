package member;
import java.util.Scanner;

import member.DAO.MemberDAO;
import member.DTO.MemberDTO;	// 서로다른 패키지 사용시 import

public class MemberTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MemberDTO ex = new MemberDTO();
		Member ex1 = new Member();

		MemberDAO dao = new MemberDAO();
		dao.test();
	}

}
