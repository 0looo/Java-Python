import java.util.StringTokenizer;

public class Ex03 {
	public static void main(String[] args) {
		// 문자열을 토큰으로 받음
		String text = "홍길동 이수홍 박연수";
		StringTokenizer st = new StringTokenizer(text);
		int cnt = st.countTokens();
		for (int i =0;i<cnt;i++) {
			String str = st.nextToken();
			System.out.println(str);
		}
		
		text = "김철수/박연수,이가연";
		StringTokenizer st1 = new StringTokenizer(text,"/|,");
		while(st1.hasMoreTokens()) {
			String str = st1.nextToken();
			System.out.println(str);
		}
		
	}

}
// charAt(idx) : 특정인덱스 문자 가져오기
// indexOf(ch) : 특정문자의 index를 받음
// length() : 문자열의 문자의 갯수
// replace("old","new") : 문자열 바꾸기
// substring(시작 index, 시작 + 뽑을 문자수) : 문자열 자르기
// toLowerCase() : 소문자로 변형
// toUpperCase() : 대문자로 변형
// String.valueOf(letteral) : 문자가 아닌 리터널을문자열로
// getBytes() : 문자열을 바이트로 변환