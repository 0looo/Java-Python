
public class Ex10 {
	int boardNum;
	String subject;
	String content;
	
	// 생성자  // 메서드 오버로딩
	public Ex10() {}
	public Ex10(int boardNum) {
		this.boardNum = boardNum;
	}
	public Ex10(String subject) {
		this.subject = subject;
	}
	public Ex10(int boardNum, String content) {
		this.boardNum = boardNum;
		this.content = content;
	}
	public Ex10(String content, int boardNum) {
		this.boardNum = boardNum;
		this.content = content;
	}
	
	// 매개변수 0, 반환값  X : setter
	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void setContent(String content) {
		this.content = content;
	}
	// 매개변수 X, 반환값 0 : getter
	public int getBoardNum() {
		return this.boardNum;
	}
	public String getSubject() {
		return this.subject;
	}
	public String getContent() {
		return this.content;
	}

}
