import java.util.Date;

public class Ex06 {

	public static void main(String[] args) {
		String name = "LeeYK";
		int age = 31;
		double height = 177.0;
		System.out.println("나의 이름은"+ name + ", 나이는" + age + ", 키는" + height + "입니다.");
		
		// printf 활용
		// printf시 자동줄바꿈이 되지 않음. 따라서 \n을 적어줘야 함.
		System.out.printf("나의 이름은 %s이고, 나이는 %d, 키는 %f입니다. \n", name, age, height);
		System.out.printf("나의 이름은 %s이고, 나이는 %d, 키는 %.1f입니다. \n", name, age, height);
		System.out.printf("나의 이름은 %s이고, 나이는 %d, 키는 %d입니다. \n", name, age, (int)height);
		
		// format 문자 : %s(문자열), %d(정수), %f(실수), %c(문자), %b(bool)
		System.out.println("======================");
		System.out.printf("나의 이름은 %s입니다. 나이는 %d입니다. \n", name, age);
		
		// 출력공간 설정 및 정렬변경
		System.out.printf("나의 이름은 %10s입니다. 나이는 %10d입니다. \n", name, age);
		// 양수숫자는 오른쪽 정렬
		
		System.out.printf("나의 이름은 %-10s입니다. 나이는 %-10d입니다. \n", name, age);
		// 음수숫자는 왼쪽 정렬
		
		System.out.printf("당신은 한국사람이면 %b입니다. \n", true);
		System.out.printf("당신은 한국사람이면 %b입니다. \n", 0);  // %b 자리는 값이 있으면 true 
		System.out.printf("당신은 한국사람이면 %b입니다. \n", null); // null일때만 false
		
		// 출력제한 
		System.out.printf("%4s \n","hello java");  // 출력제한되지 않음
		System.out.printf("%4s \n","hi");  // 출력제한되지 않음
		System.out.printf("%4.2s \n","hello java");  // 4자리 중 왼쪽 2자리에만 2개표시
		System.out.printf("%4.2f \n", 1234567.123456);
		
		// Date => import util : 현재 날짜 출력 
		Date date = new Date();
		System.out.println(date);
		// %tH : 시간, %tM : 분, %tS : 초 
		// %tA : 요일, %tB, %tm : 달, %tY : 연도, %td : 일자
		System.out.printf("현재 시간은 %tH, 분은 %tM, 초는 %tS입니다. \n", date, date, date);
		System.out.printf("요일은 %tA, 달은 %tB, 년도는 %tY년도, 일자 %td일 입니다. \n", date, date, date, date);
		
	}

}
