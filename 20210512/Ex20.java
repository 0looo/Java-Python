
public class Ex20 {

	public static void main(String[] args) {
		int [] score = {79,88,91,33,100,55,95};
		int max = score[0];  // 79 -> 100
		int min = score[0];  // 79 -> 33
		
		for(int i=1;i<score.length;i++) {
			if(max <= score[i]) {
				max = score[i];
			}else if(min > score[i]) {
				min = score[i];
			}
		}
		
		System.out.println("max : " + max);
		System.out.println("min : " + min);
	}

}