
public class Ex10Test {

	public static void main(String[] args) {
		Board board = new Board();
		// ���� ���������ϴ� ���� �������� ����.
		
		/*board.content = "����";
		board.subject = "����";
		board.writer = "jeck";
		*/
		
		// Class ���� ���� ����
		// 1. public void ____(����type ������) {
		// �������� = ������}
		// �̷������� ���
		board.setConent("����");
		board.setSubject("����");
		board.setWriter("jeck");
		
		System.out.println(board.getContent());
		System.out.println(board.getSubject());
		System.out.println(board.getWriter());
		
		
		
		

	}

}
