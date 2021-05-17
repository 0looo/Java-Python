
public class Ex09 {
	// cmd에서 java 실행
	// .class 파일로 실행하므로 파일 위치를 이동.
	// java 파일명
	
	public static void main(String[] args) {
		if(args[0].equals("/?")) {
			System.out.println("도움말입니다.");
			// cmd실행시 입력값
			// java Ex09 /?
			
		}else if(args[0].equals("+")) {
			System.out.println(Integer.parseInt(args[1]) + Integer.parseInt(args[2]));
			// cmd실행시 입력값
			// java Ex09 + in1 in2
		}else if(args[0].equals("-")) {
			System.out.println(Integer.parseInt(args[1]) - Integer.parseInt(args[2]));
		}
			// cmd실행시 입력값
			// java Ex09 - in1 in2
	}
}
