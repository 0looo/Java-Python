
public class Ex10Test {

	public static void main(String[] args) {
		Board board = new Board();
		// 값을 직접대입하는 것을 좋아하지 않음.
		
		/*board.content = "내용";
		board.subject = "제목";
		board.writer = "jeck";
		*/
		
		// Class 사용시 변수 사용법
		// 1. public void ____(변수type 변수명) {
		// 넣을변수 = 변수명}
		// 이런식으로 사용
		board.setConent("내용");
		board.setSubject("제목");
		board.setWriter("jeck");
		
		System.out.println(board.getContent());
		System.out.println(board.getSubject());
		System.out.println(board.getWriter());
		
		
		
		

	}

}
