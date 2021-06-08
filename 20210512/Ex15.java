
public class Ex15 {

	public static void main(String[] args) {
		int score1 = 83;
		int score2 = 90;
		int score3 = 83;
		int score4 = 90;
		int score5 = 83;
		int score6 = 90;
		int sum = 0;
		sum += score1;
		sum += score2;
		sum += score3;
		sum += score4;
		sum += score5;
		sum += score6;
		System.out.println(sum);
		
		int score [] = {83,90,83,90,83};
		// 배열 안에 있는 각각의 값들을 요소라고 한다.
		// 각 요소는 index를 갖는다.
		System.out.println(score[2]);
		sum = 0;
		for(int idx = 0; idx <=4; idx++) {
			sum += score[idx];
		}
		System.out.println(sum);
		
	}

}
