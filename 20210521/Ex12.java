
public class Ex12 {

	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		System.out.println(subject.indexOf("프"));
		System.out.println(subject.indexOf("프로그"));
		System.out.println("이");
		
		String oldStr = "자바는 객체지향언어입니다. 자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바", "JAVA");
		System.out.println(oldStr);
		System.out.println(newStr);
	}

}
