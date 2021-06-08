
public class Ex14 {

	public static void main(String[] args) {
		int i = 10; // 변수선언과 초기화
		System.out.println(i);
		i = 20;
		System.out.println(i);
		int j, k, l;
		// 대입연산자는 <-- 방향으로 진행
		j = k = l = 20;
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		
		System.out.println("i : " + i);
		i = i + 1 ; // 1증가식
		System.out.println("i : " + i);
		
		System.out.println("==========");
		System.out.println("i : " + i);
		i++; // 1증가식
		System.out.println("i : " + i);
		
		System.out.println("========");
		i = i + 3;
		System.out.println(i);
		i += 3;  // i = i + 3
		System.out.println(i);
		i += 2; // i = i +2

		i--; // 1씩 감소, 성능은 제일빠름
		i-=1; // 1씩감소, 변수가 적을수록 성능이 좋음 
		
		i*= 2;
		i/=2;
		i %= 2;

		// 이항연산자 중 대입연산자 : +=, -=, *=. /=, %=
		
		
		/// 삼항 연산자 : 조건식 ? 참인 결과 : 거짓 결과 ;
		
		int score = 75;
		String grade = score >= 60? "합격":"불합격";
		System.out.println(grade);
		
		score = 55;
		grade = score >= 60? "합격": "불합격";
		System.out.println(grade); 
		
	 	//ex)) socre >= 90 : 'A', score >= 80 : 'B', score >= 70 : 'C'
		
		score = 90;
		grade = score>= 90? "A": score >= 80? "B": score >= 70? "C":"불합격";
		System.out.println(grade);
		
		score = 84;
		char grade1 = score>= 90? 'A': score >= 80? 'B': score >= 70? 'C':'F';
		System.out.println(grade1);
		
	}

}
